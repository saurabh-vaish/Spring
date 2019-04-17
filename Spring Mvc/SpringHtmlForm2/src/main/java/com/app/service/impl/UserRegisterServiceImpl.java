package com.app.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserRegisterDao;
import com.app.model.User;
import com.app.service.IUserRegisterService;

@Service
public class UserRegisterServiceImpl implements IUserRegisterService {

	@Autowired
	private IUserRegisterDao dao;
	
	@Transactional
	public Integer saveUser(User u) {
		return dao.saveUser(u);
	}

	@Transactional
	public void updateUser(User u) {
		dao.updateUser(u);
	}

	@Transactional
	public void deleteUser(Integer id) {
		dao.deleteUser(id);
	}

	@Transactional(readOnly=true)
	public User getUserById(Integer id) {
		return dao.getUserById(id);
	}

	@Transactional(readOnly=true)
	public List<User> getAllUsers() {
		return dao.getAllUsers();
	}
}
