package com.collec;

public class MyData {

	public String name;
	public int age;
	
	public MyData() {
		name = "";
		age = 0;
	}
	
	public MyData(String name, int age) { // 생성자 오버로딩
		this.name = name;
		this.age = age;
	}
	
}
