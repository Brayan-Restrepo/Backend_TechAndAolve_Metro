package com.metro.domain.subway.model;

import java.util.HashMap;
import java.util.Map;

public class UnderGround {

	private Map<Integer, RailRoadTrack> railRoadTracks;

	private Map<Integer, Station> stations;
	
	
	public UnderGround() {
		this.stations = new HashMap<>();
		this.railRoadTracks = new HashMap<>();
	}
	public boolean addWay(Station station1, Station station2, int peso, Route route) {

		if (station1.equals(station2))
			return false;

		RailRoadTrack railRoadTrack = new RailRoadTrack(station1, station2, peso, route);

		if (railRoadTracks.containsKey(railRoadTrack.hashCode()) || station1.containVicinity(railRoadTrack)
				|| station2.containVicinity(railRoadTrack)) {
			return false;
		}

		railRoadTracks.put(railRoadTrack.hashCode(), railRoadTrack);
		station1.addVicinity(railRoadTrack);
		station1.addVicinity(railRoadTrack);
		return true;
	}
	
	public boolean addStation(Station station) {
		
		if(stations.containsKey(station.hashCode())) {
			return false;
		}
		stations.put(station.hashCode(), station);
		return true;
	} 
	
	
	public Map<Integer, Station> getStations() {
		return this.stations;
	}
	
	

}
