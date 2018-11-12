package com.metro.metro.repository;

import java.util.List;

import com.metro.metro.domain.user.model.DestinationHistorical;
import com.metro.metro.domain.user.model.statisticalHistorical;


public interface IHistoryRepository  {
	
	public void save(DestinationHistorical destinationHistorical);
	
	public List<DestinationHistorical> findAll();
	
	public long countStationbyOriginAndDestiny(String stationOrigin, String stationDestiny);
	
	public List<statisticalHistorical> countStadisticByStationOriginAndStationDestiny();
}
