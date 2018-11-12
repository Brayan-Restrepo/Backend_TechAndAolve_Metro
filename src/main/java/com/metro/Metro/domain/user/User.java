package com.metro.metro.domain.user;

import java.util.List;

public class User {

    private String userName;
	private String password;
    private UserRol rol;
    private List<String> history;
    
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
	public List<String> getHistory() {
		return history;
	}
	public void setHistory(List<String> history) {
		this.history = history;
	}
}
