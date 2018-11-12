package com.metro.metro.repository.impl;

import java.lang.reflect.Type;
import java.util.List;

import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.metro.metro.domain.user.HistoryDestination;
import com.metro.metro.mapper.IMapper;
import com.metro.metro.repository.IHistoryRepository;
import com.metro.metro.repository.entitity.HistoryDestinationEntity;
import com.metro.metro.repository.jpa.HistoryJpaRepository;

@Repository
public class HistoryRepositoryImpl implements IHistoryRepository {

	@Autowired
	private HistoryJpaRepository historyJpa;
	
	@Autowired
	private IMapper mapper;
	
	@Override
	public void save(HistoryDestination historyDestination) {
		
		HistoryDestinationEntity historyDest = mapper.map(historyDestination, HistoryDestinationEntity.class);
		historyJpa.save(historyDest);
	}

	@Override
	public List<HistoryDestination> findAll() {
		
		Type listType = new TypeToken<List<HistoryDestination>>() {}.getType();
		List<HistoryDestinationEntity> historyEntity = historyJpa.findAll();
		
		return mapper.map(historyEntity, listType);
	}

	@Override
	public long countStationbyOriginAndDestiny(String stationOrigin, String stationDestiny) {
		
		return historyJpa.countByStationOriginAndStationDestiny(stationOrigin, stationDestiny);
	}

}
