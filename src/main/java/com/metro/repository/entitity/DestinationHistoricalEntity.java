package com.metro.repository.entitity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class DestinationHistoricalEntity {

	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date date = new Date();
    
	@Column(nullable = false)
    private String stationOrigin;
    
    @Column(nullable = false)
    private String stationDestiny;
    
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

 
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
