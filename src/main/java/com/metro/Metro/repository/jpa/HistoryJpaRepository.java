package com.metro.metro.repository.jpa;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metro.metro.repository.entitity.HistoryDestinationEntity;

@Repository
public interface HistoryJpaRepository extends JpaRepository<HistoryDestinationEntity, Long> {
	
	long countByStationOriginAndStationDestiny(String stationOrigin, String stationDestiny);

}
