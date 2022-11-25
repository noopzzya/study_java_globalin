package com.classexam;

public class LgTv {

	public static void main(String[] args) {
		
		Tv tv; // 객체 선언 --> 인스턴스를 참조하기 위한 참조변수

		tv = new Tv(); // 객체생성--> Tv 인스턴스를 생성
		// Tv tv = new Tv() --> 1줄로 가능 (new가 없을 경우 선언만 하고 생성 안 함)
		
		// 채널 값 24 할당
		tv.channel = 24;
		
		// tv객체 메소드호출
		tv.channelDown();
		
		System.out.println("현재 LgTv의 채널은 " +tv.channel+ "입니다.");
		
	}

}
