package com.metro.domain.user.model;

import java.util.Date;

public class DestinationHistorical {
	
    private Date date;
    private String stationOrigin;
    private String stationDestiny;
	
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
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

}
