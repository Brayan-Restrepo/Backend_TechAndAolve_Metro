package com;

import java.util.List;

import com.metro.domain.MetroManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.metro.domain.user.model.DestinationHistorical;
import com.metro.domain.user.model.User;
import com.metro.domain.user.model.UserRol;
import com.metro.domain.user.model.statisticalHistorical;

//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@SpringBootApplication
public class MetroApplication implements CommandLineRunner {

	@Autowired
	private MetroManager manager;

	public static void main(String[] args) {
		SpringApplication.run(MetroApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception {

		User i = new User();
		i.setUserName("frfrrf");
		i.setPassword("ewdewde");
		i.setRol(UserRol.INVIATADO);
		manager.saveUser(i);

		DestinationHistorical dest = new DestinationHistorical();
		dest.setUser(i);
		dest.setStationDestiny("1");
		dest.setStationOrigin("4");
		manager.saveDestinationHistory(dest);

		List<statisticalHistorical> his = manager.findStaticalHistorical();
		his.forEach(a -> System.out.println(a.getCount()));

	}

}
