package org.springboot.sample.entity;

import java.beans.Transient;
import java.util.ArrayList;
import java.util.List;


/**
 * 角色（管理员，普通用户等）
 *
 * @author	wr
 * @create	2016年06月07日
 */
public class Role extends BaseModel {

    private Integer id;
    private String rolename;
    private List<Permission> permissionList;// 一个角色对应多个权限
    private List<User> userList;// 一个角色对应多个用户

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}

	public List<Permission> getPermissionList() {
		return permissionList;
	}

	public void setPermissionList(List<Permission> permissionList) {
		this.permissionList = permissionList;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

    @Transient
    public List<String> getPermissionsName() {
        List<String> list = new ArrayList<String>();
        List<Permission> perlist = getPermissionList();
        for (Permission per : perlist) {
            list.add(per.getPermissionname());
        }
        return list;
    }
    
    @Transient
    public List<String> getPermissionsName(List<Permission> perlist) {
    	List<String> list = new ArrayList<String>();
    	for (Permission per : perlist) {
    		list.add(per.getPermissionname());
    	}
    	return list;
    }
}