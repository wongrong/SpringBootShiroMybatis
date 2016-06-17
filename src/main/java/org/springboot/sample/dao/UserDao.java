package org.springboot.sample.dao;

import java.util.List;

import org.springboot.sample.entity.User;

public interface UserDao {

	public User findByUsername(String username);

	public List<User> getList();

}
