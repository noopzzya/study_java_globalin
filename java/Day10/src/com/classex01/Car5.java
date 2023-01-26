package com.classex01;

public class Car5 {
	
	String color;
	int speed;
	
	public Car5() {
		
		color="빨강";
		speed=30;
	}
	
	public Car5(String color) {
			
		color="빨강";
		speed=30;
	}
	
	public Car5(String color, int speed) {
		
		this.color = color;
		speed = speed;
	}
	
	Car5 c11 = new Car5();
	Car5 c12 = new Car5("그린");
	Car5 c13 = new Car5("그린",30);
}
