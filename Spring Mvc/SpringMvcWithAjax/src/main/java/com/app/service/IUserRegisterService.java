package com.app.service;

import java.util.List;

import com.app.model.User;

public interface IUserRegisterService {


	public Integer saveUser(User u);
	public void updateUser(User u);
	public void deleteUser(Integer id);
	public User getUserById(Integer id);
	public List<User> getAllUsers();
	
}
