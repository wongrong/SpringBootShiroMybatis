package org.springboot.sample.utils;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PropertiesLoaderUtils;

/**
 * 加载配置文件
 * @author huanghaijun
 * @since 2015-07-08
 *
 */
public class ConfigUtil {
    private static final Logger log = LoggerFactory.getLogger(ConfigUtil.class);
    
    private ConfigUtil() {}
    
    private static Properties properties;
    
    static {
        try {
            Resource resource = new ClassPathResource("/config.properties");
            properties = PropertiesLoaderUtils.loadProperties(resource);
        } catch (Exception e) {
            log.error("读取配置文件出错", e);
        }        
    }
    
    public static String get(String key) {
        if (properties == null || key == null) {
            return null;
        }
        return properties.getProperty(key);
    }
    /**
     * 指定默认值
     * @param key
     * @param defaultValue
     * @return
     */
    public static String get(String key, String defaultValue) {
        if (properties == null || key == null) {
            return defaultValue;
        }
        String value = properties.getProperty(key);
        
        return value == null ? defaultValue : value;
    }

}
