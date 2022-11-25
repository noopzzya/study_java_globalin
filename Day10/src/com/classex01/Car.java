package com.classex01;

// 실행은 메인함수 있는 다른 클래스에서 가능
public class Car { // 클래스 정의
	
	// 속성, 필드(변수)선언
	protected String color; // (컬러) 속성선언
	protected int speed; // (속도) 속성선언
	
	public Car() {
		
	}
	
	public Car(String color) {
		this.color = color;
	}
	
	public Car(String color, int speed) {
		this.color = color;
		this.speed = speed;
	}	
	public Car(String color, String color2) {
		this.color = color;
		this.color = color2;
	}
	
	
	public String getColor() {
		return color;
	}

	public int getSpeed() {
		return speed;
	}
	

	public void setColor(String color) {
		this.color = color;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	void speedUp(int v) { // ()는 매개변수 또는 인자값
		speed += v;
		System.out.println("현재의 당신의 속도는 " +speed+ "km입니다.");
	}

	void speedDown(int v) {
		speed = v;
	}
	
	Car c = new Car();
	void prt() {
		System.out.println(c.speed);
		System.out.println(speed);
	}
	
}
