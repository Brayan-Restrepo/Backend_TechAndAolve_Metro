package com.metro.repository.jpa;

import java.util.List;

import com.metro.domain.user.model.StatisticalHistorical;
import com.metro.repository.entitity.DestinationHistoricalEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryJpaRepository extends JpaRepository<DestinationHistoricalEntity, Long> {
	
	long countByStationOriginAndStationDestiny(String stationOrigin, String stationDestiny);
	
	
	 @Query("SELECT " +
	           "    new com.metro.domain.user.model.StatisticalHistorical(h.stationOrigin, h.stationDestiny, COUNT(h) as numero) " +
	           "FROM " +
	           "    DestinationHistoricalEntity h " +
	           "GROUP BY " +
	           "    h.stationOrigin, h.stationDestiny " +
	           "ORDER BY numero desc")
	    List<StatisticalHistorical> countStadisticByStationOriginAndStationDestiny();

}
