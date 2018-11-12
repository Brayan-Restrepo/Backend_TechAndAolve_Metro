package com.metro.domain.subway.model;

import java.util.HashMap;

public class UnderGround {

	private HashMap<Integer, RailRoadTrack> railRoadTracks;

	
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
	
	

}
