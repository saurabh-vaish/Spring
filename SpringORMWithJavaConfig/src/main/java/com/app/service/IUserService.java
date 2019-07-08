package com.app.service;

import java.util.List;

import com.app.model.User;

public interface IUserService {
	
	public Integer saveUser(User user);
	public void updateUser(User user);
	public void deleteUser(Integer id);
	public User getUserById(Integer id);
	public List<User> getAllUsers();
	

}
