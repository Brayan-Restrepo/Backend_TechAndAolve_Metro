package com.metro.domain;

import com.metro.domain.user.model.DestinationHistorical;
import com.metro.domain.user.model.StatisticalHistorical;
import com.metro.domain.user.model.User;
import com.metro.repository.IHistoryRepository;
import com.metro.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetroManager {

	@Autowired
	private IUserRepository userRepo;
	
	@Autowired
	private IHistoryRepository historyRepo;
	
	
	public void saveDestinationHistory(DestinationHistorical destinationHistorical) {
		historyRepo.save(destinationHistorical);
	}
	
	public List<StatisticalHistorical> findStaticalHistorical() {
		return historyRepo.countStadisticByStationOriginAndStationDestiny();
	}
	
	public User findUser(String userName,String password) {
		return userRepo.findUser(userName, password);
	}
	
}
