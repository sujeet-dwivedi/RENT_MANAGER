package com.rmngr.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rmngr.bean.User;
import com.rmngr.dao.UserDao;
@Service("userService")
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;

	
	

	@Override
	public void addUser(User user) {
		userDao.addUser(user);		
	}

	@Override
	public void editUser(User user, int userId) {
		userDao.editUser(user, userId);
	}

	@Override
	public void deleteUser(int userId) {
		userDao.deleteUser(userId);
	}

	@Override
	public User find(int userId) {
		return userDao.find(userId);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public boolean validateUser(User user) {
		return userDao.validateUser(user);
	}

}
