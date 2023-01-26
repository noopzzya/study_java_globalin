package com.circleex;

public class Day {
	
	private String work;
	
	public void set(String work) { // 생성자 아님, 초기화용
		this.work = work;
	}
	
	public void show() {
		if(work == null) System.out.println("할 일이 없습니다.");
		else System.out.println(work+ "입니다." );
	}
}
