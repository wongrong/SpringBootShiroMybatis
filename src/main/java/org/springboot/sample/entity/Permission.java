package org.springboot.sample.entity;


/**
 * 权限（增删改查等）
 *
 * @author	wr
 * @create	2016年06月07日
 */
public class Permission extends BaseModel {

    private Integer id;
    private String permissionname;
    private Integer roleId;

    private Role role;// 一个权限对应一个角色

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getPermissionname() {
		return permissionname;
	}

	public void setPermissionname(String permissionname) {
		this.permissionname = permissionname;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

}
