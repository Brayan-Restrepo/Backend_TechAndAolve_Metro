package com.metro.domain.user.model;

public enum UserRol {
	
	INVIATADO("Invitado"),
	ADMINISTRADOR("Administrador");
	
	private String rol;
	
	private UserRol(String rol) {
		
		this.rol = rol;
	}
	
	public String getRol() {
		return rol;
	}
	
	public static UserRol getUserRolByrol(String rol) {
		
		UserRol[] userRoles = UserRol.values();
		UserRol userRolSelect = null;
		for(UserRol userRol : userRoles) {
			if(userRol.rol.equals(rol)) {
				userRolSelect = userRol;
				break;
			}
		}
		return userRolSelect;
	}

}
