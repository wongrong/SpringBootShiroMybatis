package org.springboot.sample.dao;

import java.util.List;

import org.springboot.sample.entity.Role;

public interface RoleDao {

	List<Role> getRoleList(Integer userId);
}
