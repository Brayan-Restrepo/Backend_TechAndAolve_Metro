package com.metro.metro.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metro.metro.domain.user.model.DestinationHistorical;
import com.metro.metro.domain.user.model.User;
import com.metro.metro.domain.user.model.statisticalHistorical;
import com.metro.metro.repository.IHistoryRepository;
import com.metro.metro.repository.IUserRepository;

@Service
public class MetroManager {

	@Autowired
	private IUserRepository userRepo;
	
	@Autowired
	private IHistoryRepository historyRepo;
	
	
	public void saveUser(User user) {
		userRepo.save(user);
	}
	
	public void saveDestinationHistory(DestinationHistorical destinationHistorical) {
		historyRepo.save(destinationHistorical);
	}
	
	public List<statisticalHistorical> findStaticalHistorical() {
		return historyRepo.countStadisticByStationOriginAndStationDestiny();
	}
	
	public boolean existsUser(String userName) {
		return userRepo.existsUser(userName);
	}
}
