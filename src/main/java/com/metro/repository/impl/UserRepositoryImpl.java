package com.metro.repository.impl;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Optional;

import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.metro.domain.user.model.User;
import com.metro.domain.user.model.UserRol;
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
	
	@Override
	public boolean existsUser(String userName) {
	
		return userJpa.existsById(userName);
	}
	
	@Override
	public User findUser(String userName, String password) {
		
		User user = null;
		Optional<UserEntity> userEntity = userJpa.findById(userName);
		boolean isValid =password.equals(userEntity.orElse(new UserEntity()).getPassword());
		if(isValid) {
			UserEntity userpers = userEntity.orElse(null);
			user = mapper.map(userpers, User.class);
			user.setRol(UserRol.getUserRolByrol(userpers.getRol()));
		}
		return user;
		
	}
	
}
