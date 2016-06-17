package org.springboot.sample.dao;

import java.util.List;

import org.springboot.sample.entity.Permission;

public interface PermissionDao {
	
	List<Permission> getPermissionList(Integer roleId);
}
