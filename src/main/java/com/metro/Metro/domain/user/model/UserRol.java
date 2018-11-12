package com.metro.metro.domain.user.model;

public enum UserRol {
	
	INVIATADO("Invitado"),
	ADMINISTRADO("Administrador");
	
	private String rol;
	
	private UserRol(String rol) {
		
		this.rol = rol;
	}
	
	public String getRol() {
		return rol;
	}

}
