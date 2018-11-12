package com.metro.metro.domain.subway.model;

import java.util.ArrayList;
import java.util.List;

public class Station {
	
	private String name;
	private List<RailRoadTrack> vicinity = new ArrayList<>();

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<RailRoadTrack> getVicinity() {
		return vicinity;
	}
	public void setVicinity(List<RailRoadTrack> vicinity) {
		this.vicinity = vicinity;
	}

	public boolean containVicinity(RailRoadTrack railRoadTrack) {
		return this.vicinity.contains(railRoadTrack);
	}
	

	public void addVicinity(RailRoadTrack railRoadTrack) {
		if (!this.vicinity.contains(railRoadTrack))
			this.vicinity.add(railRoadTrack);
	}
	
	@Override
	public boolean equals(Object object) {
		if (!(object instanceof Station))
			return false;

		Station station = (Station) object;
		return this.name.equals(station.name);
	}
	
	@Override
	public int hashCode()
	    {
		return this.name.hashCode();
	    }
	

}
