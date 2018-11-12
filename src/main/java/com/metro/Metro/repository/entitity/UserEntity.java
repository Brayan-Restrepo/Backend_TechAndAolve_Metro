package com.metro.metro.repository.entitity;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class UserEntity {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long userId;
	
    @Column(nullable = false, unique = true)
    private String userName;

    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String rol;

 
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "userEntity")
    private List<HistoryDestinationEntity> historyDestination = new ArrayList<>();

    public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

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
