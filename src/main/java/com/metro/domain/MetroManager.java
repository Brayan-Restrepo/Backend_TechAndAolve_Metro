package com.metro.domain;

import com.metro.domain.subway.builder.UnderGroundBuilder;
import com.metro.domain.subway.model.Station;
import com.metro.domain.subway.model.UnderGround;
import com.metro.domain.user.model.DestinationHistorical;
import com.metro.domain.user.model.StatisticalHistorical;
import com.metro.domain.user.model.User;
import com.metro.repository.IHistoryRepository;
import com.metro.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Service
public class MetroManager {

	@Autowired
	private IUserRepository userRepo;
	
	@Autowired
	private IHistoryRepository historyRepo;
	
	private UnderGround underGround;
	
	public MetroManager() {
		UnderGroundBuilder builder =  new UnderGroundBuilder();
		this.underGround = builder.getUnderGround();
	}
	
	
	public void saveDestinationHistory(DestinationHistorical destinationHistorical) {
		historyRepo.save(destinationHistorical);
	}
	
	public List<StatisticalHistorical> findStaticalHistorical() {
		return historyRepo.countStadisticByStationOriginAndStationDestiny();
	}
	
	public User findUser(String userName,String password) {
		return userRepo.findUser(userName, password);
	}
	
	public List<String> getStations() {
		
		List<String> stationsName = new ArrayList<>();
		Collection<Station> stationList = underGround.getStations().values();
		stationList.forEach(station -> stationsName.add(station.getName()));
		return stationsName;
	}
	
}
