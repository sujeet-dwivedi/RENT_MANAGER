package com.rmngr.service;

import java.util.List;

import com.rmngr.bean.User;


public interface UserService {

	public void addUser(User user);

	public void editUser(User user, int userId);

	public void deleteUser(int userId);

	public User find(int userId);

	public List < User > findAll();
	
	public boolean validateUser(User user);

}
