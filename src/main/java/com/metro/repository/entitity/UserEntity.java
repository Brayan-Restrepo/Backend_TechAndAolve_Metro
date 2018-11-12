package com.metro.repository.entitity;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class UserEntity {
	
	
    
	@Id
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String rol;

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

	public String getRol() {
		return rol;
	}

	public void setRol(String rol) {
		this.rol = rol;
	}
}
