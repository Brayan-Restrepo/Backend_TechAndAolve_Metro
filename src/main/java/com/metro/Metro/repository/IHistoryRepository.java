package com.metro.metro.repository;

import java.util.List;

import com.metro.metro.domain.user.HistoryDestination;


public interface IHistoryRepository  {
	
	public void save(HistoryDestination historyDestination);
	
	public List<HistoryDestination> findAll();
	
	public long countStationbyOriginAndDestiny(String stationOrigin, String stationDestiny);
}
