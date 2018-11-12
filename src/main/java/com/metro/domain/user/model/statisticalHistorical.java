package com.metro.domain.user.model;

public class statisticalHistorical {
	
	private String stationOrigin;
	private String stationDestiny;
	private long count;

	public statisticalHistorical(String stationOrigin,String stationDestiny,long count ) {
		
		this.stationDestiny = stationDestiny;
		this.stationOrigin = stationOrigin;
		this.count = count;
	}
	
	public String getStationOrigin() {
		return stationOrigin;
	}
	public void setStationOrigin(String stationOrigin) {
		this.stationOrigin = stationOrigin;
	}
	public String getStationDestiny() {
		return stationDestiny;
	}
	public void setStationDestiny(String stationDestiny) {
		this.stationDestiny = stationDestiny;
	}
	public long getCount() {
		return count;
	}
	public void setCount(long count) {
		this.count = count;
	}
}
