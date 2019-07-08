package com.app.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.app.dao.IUserDao;
import com.app.model.User;

@Repository
public class UserDaoImpl implements IUserDao {

	
	@Autowired
	private HibernateTemplate ht;     //  depends on hibernate Template 
	
	@Override
	public Integer saveUser(User user) { System.out.println(user);
		return (Integer) ht.save(user);
	}

	@Override
	public void updateUser(User user) {
		ht.update(user);
	}

	@Override
	public void deleteUser(Integer id) {
		ht.delete(new User(id));
	}

	@Override
	public User getUserById(Integer id) {
		return ht.get(User.class, id);
	}

	@Override
	public List<User> getAllUsers() {
		return ht.loadAll(User.class);
	}

}
