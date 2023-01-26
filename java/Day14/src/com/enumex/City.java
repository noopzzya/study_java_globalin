package com.enumex;

public enum City {

	SEOUL("서울", 1000), // 0
	BUSAN("부산", 350), // 1
	DAEGU("대구", 250), // 2
	INCHON("인천", 200); // 3
	
	private final String cityName;
	private final int ingu;
	
	City(String cityName, int ingu) {
		this.cityName = cityName;
		this.ingu = ingu;
	}

	public String getCityName() {
		return cityName;
	}

	public int getIngu() {
		return ingu;
	}
	
}
