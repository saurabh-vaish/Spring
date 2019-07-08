package com.app.dao;

import java.util.List;

import com.app.model.User;

public interface IUserDao {

	public Integer saveUser(User user);
	public void updateUser(User user);
	public void deleteUser(Integer id);
	public User getUserById(Integer id);
	public List<User> getAllUsers();
	
	
}
