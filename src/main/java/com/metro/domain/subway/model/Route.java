package com.metro.domain.subway.model;

public enum Route {
	A("A"),
	B("B"),
	C("C"),
	D("D"),
	E("E"),
	F("F");
	
	private String name;
	
	private Route(String name) {
		
		this.name = name;
	}
	
	public String getName() {
		return name;
	}

}
