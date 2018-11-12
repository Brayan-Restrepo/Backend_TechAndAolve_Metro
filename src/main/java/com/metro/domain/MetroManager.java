package com.metro.domain;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metro.domain.user.model.DestinationHistorical;
import com.metro.domain.user.model.User;
import com.metro.domain.user.model.statisticalHistorical;
import com.metro.repository.IHistoryRepository;
import com.metro.repository.IUserRepository;

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
}
