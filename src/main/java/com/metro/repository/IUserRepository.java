package com.metro.repository;

import java.util.List;

import com.metro.domain.user.model.User;

public interface IUserRepository  {
	
	public void save(User user);
	
	public List<User> findAll();
	
	public boolean existsUser(String userName);
	
	public User findUser(String userName, String passwprd);
	
}
