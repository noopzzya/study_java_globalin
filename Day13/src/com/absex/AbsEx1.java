package com.absex;

public abstract class AbsEx1 {

	int a = 100; // 변수
	final String str = "자바가 최고야!"; // 상수
	public String getStr() { // 일반 메소드 (세미콜론없음)
		return str;
	}
	
	// 추상 메소드
	public abstract int getA();
	
	
}
