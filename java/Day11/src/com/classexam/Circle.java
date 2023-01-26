package com.classexam;

public class Circle {
	
	// 원의 반지름
	public int radius; // public은 필드 앞에 사용가능(생략가능)
	
	// 원의 이름
	String name;
	
	
	// 생성자 함수(메소드)
	public Circle() {
		// 기본 생성자 : 매개변수가 없고, 아무 일없이 단순함
		radius=1;
	//	name="";
	}

	public Circle(int r, String n) {
//		this();  생성자, 첫 줄에 써야함(첫 줄아니면 오류)
		this.radius=r;
		this.name=n;		
	}

	
	void set(int r) {
		radius = r;
	}
		
	// 원의 면적을 구하는 메소드 정의
	public double getArea() {
		return 3.14*radius*radius;
	}
}
