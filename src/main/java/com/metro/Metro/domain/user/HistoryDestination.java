package com.metro.metro.domain.user;

import java.util.Date;

public class HistoryDestination {
	
	private User user;
    private Date date;
    private String stationOrigin;
    private String stationDestiny;
	
    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

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
