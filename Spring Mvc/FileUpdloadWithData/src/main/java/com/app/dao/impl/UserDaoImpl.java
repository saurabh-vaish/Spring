package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IUserDao;
import com.app.model.User;

@Repository
public class UserDaoImpl implements IUserDao {

	@Autowired
	private HibernateTemplate ht;
	
	@Transactional
	public Integer saveUser(User user) {
		return (Integer) ht.save(user);
	}

	@Transactional(readOnly=true)
	public List<User> getAllUsers() {
		return ht.loadAll(User.class);
	}
	
	@Transactional(readOnly=true)
	public User getUserById(Integer id) {
		return ht.get(User.class, id);
	}
}
