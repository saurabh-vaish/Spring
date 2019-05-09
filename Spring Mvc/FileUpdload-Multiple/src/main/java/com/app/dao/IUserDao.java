package com.app.dao;

import java.util.List;

import com.app.model.User;

public interface IUserDao {

	public Integer saveUser(User user);
	public List<User> getAllUsers();
	public User getUserById(Integer id);
	
}
