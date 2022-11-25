package com.classexam;

public class Tv { // 클래스의 정의(설계도)

	// 멤버필드 (속성, 변수)
	// 색상
	String color;
	
	// 전원상태
	boolean power;
	
	// 채널
	int channel;
	
	// 기능, 행위 동작(메소드)
	// Tv를 켜거나 끄는 기능의 메소를 정의
	public void power() {
		power = !power;
	}
	public void channelUp() {
		++channel;
	}
	public void channelDown() {
		--channel;
	}
	
}
