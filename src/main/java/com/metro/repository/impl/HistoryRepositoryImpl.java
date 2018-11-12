package com.metro.repository.impl;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.metro.domain.user.model.DestinationHistorical;
import com.metro.domain.user.model.StatisticalHistorical;
import com.metro.mapper.IMapper;
import com.metro.repository.IHistoryRepository;
import com.metro.repository.entitity.DestinationHistoricalEntity;
import com.metro.repository.entitity.UserEntity;
import com.metro.repository.jpa.HistoryJpaRepository;

@Repository
public class HistoryRepositoryImpl implements IHistoryRepository {

	@Autowired
	private HistoryJpaRepository historyJpa;
	
	@Autowired
	private IMapper mapper;
	
	@Override
	public void save(DestinationHistorical destinationHistorical) {
		
		DestinationHistoricalEntity destHistorical = mapper.map(destinationHistorical, DestinationHistoricalEntity.class);
		historyJpa.save(destHistorical);
	}

	@Override
	public List<DestinationHistorical> findAll() {
		
		Type listType = new TypeToken<List<DestinationHistorical>>() {}.getType();
		List<DestinationHistoricalEntity> historyEntity = historyJpa.findAll();
		
		return mapper.map(historyEntity, listType);
	}

	@Override
	public long countStationbyOriginAndDestiny(String stationOrigin, String stationDestiny) {
		
		return historyJpa.countByStationOriginAndStationDestiny(stationOrigin, stationDestiny);
	}

	@Override
	public List<StatisticalHistorical> countStadisticByStationOriginAndStationDestiny() {
		
		return historyJpa.countStadisticByStationOriginAndStationDestiny();
	}

}
