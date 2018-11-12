package com.metro.domain.subway.model;

public class RailRoadTrack {

	private Station station1;
	private Station station2;
	private int distance;


	public RailRoadTrack(Station station1, Station station2, int distance,Route route) {

		this.station1 = station1;
		this.station2 = station2;
		this.distance = distance;
		this.route = route;

	}

	public Station getStation1() {
		return station1;
	}

	public void setStation1(Station station1) {
		this.station1 = station1;
	}

	public Station getStation2() {
		return station2;
	}

	public void setStation2(Station station2) {
		this.station2 = station2;
	}

	public int getDistance() {
		return distance;
	}

	public void setDistance(int distance) {
		this.distance = distance;
	}
	
	public Route getRoute() {
		return route;
	}

	public void setRoute(Route route) {
		this.route = route;
	}

	private Route route;

	@Override
	public boolean equals(Object object) {

		if (!(object instanceof RailRoadTrack))
			return false;

		RailRoadTrack railRoadTrack = (RailRoadTrack) object;

		return (railRoadTrack.station1.equals(this.station1) && 
				railRoadTrack.station2.equals(this.station2))&&
				railRoadTrack.getRoute() == this.route;

	}

	@Override
	public int hashCode() {
		return (station1.getName() + station2.getName()+ route).hashCode();
	}
	
	
	
	@Override
	 public String toString()
	    {
		return "(" + this.station1 + "-" + this.station2  + ",route "+ this.route.getName()+")";
	    }
}
