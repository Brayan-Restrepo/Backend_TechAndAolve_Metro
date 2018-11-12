package com.metro.repository;

import java.util.List;

import com.metro.domain.user.model.DestinationHistorical;
import com.metro.domain.user.model.statisticalHistorical;


public interface IHistoryRepository  {
	
	public void save(DestinationHistorical destinationHistorical);
	
	public List<DestinationHistorical> findAll();
	
	public long countStationbyOriginAndDestiny(String stationOrigin, String stationDestiny);
	
	public List<statisticalHistorical> countStadisticByStationOriginAndStationDestiny();
}
