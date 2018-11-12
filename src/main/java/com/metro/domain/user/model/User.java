package com.metro.domain.user.model;

import java.util.List;

public class User {

    private String userName;
	private String password;
    private UserRol rol;
    private List<DestinationHistorical> history;
    
    public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public UserRol getRol() {
		return rol;
	}
	public void setRol(UserRol rol) {
		this.rol = rol;
	}
	public List<DestinationHistorical> getHistory() {
		return history;
	}
	public void setHistory(List<DestinationHistorical> history) {
		this.history = history;
	}
}
