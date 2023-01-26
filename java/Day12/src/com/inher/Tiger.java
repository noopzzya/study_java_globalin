package com.inher;

public class Tiger extends Animal{

	private String name;
	
	public Tiger() {
		name = getClass().getSimpleName(); // name 초기화
	}

	public String getName() {
		return name;
	}
	
	@Override
	public String scream() {
		// TODO Auto-generated method stub
		return "어흥";
	}	
}
