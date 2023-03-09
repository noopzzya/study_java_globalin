package com.inher;

public class Cat extends Animal{

	private String name;
	
	public Cat() {
		name = getClass().getSimpleName();
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String scream() {
		// TODO Auto-generated method stub
		return "야옹";
	}
}
