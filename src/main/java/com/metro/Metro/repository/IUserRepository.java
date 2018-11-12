package com.metro.metro.repository;

import java.util.List;

import com.metro.metro.domain.user.User;

public interface IUserRepository  {
	
	public void save(User user);
	
	public List<User> findAll();
	
}
