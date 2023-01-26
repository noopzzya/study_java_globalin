package com.globalin;

public class Seat {
	
	private String name;
	public Seat() {
		name = null;
	}
	
	public String getName() {
		return name;
	}
	
	public void cancel() {
		name = null;
	}
	
	public void reserve(String name) {
		this.name = name;
	}
	
	public boolean math(String name) {
		return (name.equals(this.name));
	}
	
	// 좌석 유무
	public boolean isOccupied() {
		if(name == null)
			return false;
		else 
			return true;
	}
	
}
