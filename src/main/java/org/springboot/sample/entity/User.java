package org.springboot.sample.entity;

import java.beans.Transient;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 用户
 *
 * @author	wr
 * @create	2016年06月07日
 */
public class User extends BaseModel {

    private Integer id;
    private String username;
    private String password;    
    private List<Role> roleList;// 一个用户具有多个角色

    public User() {
        super();
    }

    public User(String username, String password) {
        super();
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	@Transient
    public Set<String> getRolesName(List<Role> roleList) {
        Set<String> set = new HashSet<String>();
        for (Role role : roleList) {
            set.add(role.getRolename());
        }
        return set;
    }

}