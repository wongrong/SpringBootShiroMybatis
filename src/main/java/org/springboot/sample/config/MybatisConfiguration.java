package org.springboot.sample.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springboot.sample.utils.ConfigUtil;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * @author hhj
 *
 */
@Configuration
@EnableTransactionManagement
@MapperScan("org.springboot.sample.dao")
public class MybatisConfiguration {

	@Bean
	@Primary
	@ConfigurationProperties(prefix = "datasource.primary")
	public DataSource dataSource() {
		DruidDataSource dataSource = new DruidDataSource();
		dataSource.setDriverClassName(ConfigUtil.get("driverClassName"));
		dataSource.setUsername(ConfigUtil.get("database.master.username"));
		dataSource.setPassword(ConfigUtil.get("database.master.password"));
		dataSource.setUrl(ConfigUtil.get("database.master.url"));
		
		return dataSource;
	}
	
	@Bean
	public PlatformTransactionManager txManager() {
		return new DataSourceTransactionManager(dataSource());
	}

	@Bean
	public SqlSessionFactory sqlSessionFactory() throws Exception {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource());
		PathMatchingResourcePatternResolver resolver = new PathMatchingResourcePatternResolver();
		sqlSessionFactoryBean.setMapperLocations(resolver.getResources("classpath:/META-INF/db/mapper/*.xml"));
		return sqlSessionFactoryBean.getObject();
	}

}
