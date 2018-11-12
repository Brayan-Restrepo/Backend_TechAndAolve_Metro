package com.metro.repository.impl;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.metro.domain.user.model.User;
import com.metro.mapper.IMapper;
import com.metro.repository.IUserRepository;
import com.metro.repository.entitity.UserEntity;
import com.metro.repository.jpa.UserJpaRepository;

@Repository
public class UserRepositoryImpl implements IUserRepository{

	@Autowired
	private UserJpaRepository userJpa;
	
	@Autowired
	private IMapper mapper;
	
	
	
	@Override
	public void save(User user) {

		UserEntity userEntity = mapper.map(user, UserEntity.class);
		userJpa.save(userEntity);
	}

	@Override
	public List<User> findAll() {
		
		Type listType = new TypeToken<List<User>>() {}.getType();
		List<UserEntity> usersEntity = userJpa.findAll();
		
		return mapper.map(usersEntity, listType);
	}
	
}
