package com.metro;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.metro.metro.domain.user.User;
import com.metro.metro.domain.user.UserRol;
import com.metro.metro.repository.IUserRepository;




//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class MetroApplication implements CommandLineRunner {
	
	@Autowired
	private IUserRepository userRepo;

	public static void main(String[] args) {
		SpringApplication.run(MetroApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		User i = new User();
		i.setUserName("frfrrf");
		i.setPassword("ewdewde");
		i.setRol(UserRol.INVIATADO);
		userRepo.save(i);
		List<User> users = userRepo.findAll();
		
		users.forEach(user->System.out.println(user.getUserName()));
		
	}
}
