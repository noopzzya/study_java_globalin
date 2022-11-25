package com.inher;

public class Dog extends Animal{
	
	private String name;
	
	public Dog() {
		name = getClass().getSimpleName(); // name 초기화
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String scream() {
		// TODO Auto-generated method stub
		return "멍멍";
	}
	
}
