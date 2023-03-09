package com.classex;

public class ClassEx01 {
	
	int a; // 전역변수, 인스턴스변수 : 전역변수는 초기화 없을 경우 해당 자료형의 최소값으로 자동설정
		
	public static void main(String[] args) { // 메소드
		
		// 메소드 안에 선언한 변수를 지역변수
		// 지역변수는 초기화 과정을 거치지 않으면 사용 할 수 없다
		// 자동 초기화 기능을 지원하지 않는다
		
		ClassEx01 ce = new ClassEx01(); 
		// 객체생성 또는 인스턴스 생성
		
		//int a; // 지역변수 선언
		// 인스턴스 생성해야지만 인스턴스 변수에 접근 가능
		System.out.println("ce.a:" +ce.a); 
		// 초기화를 지원하지 않기 때문에
		// 초기화를 해야만 사용 할 수 있다.
		// 초기화의 감지는 컴파일러가 감지하여 오류를 발생
		
	}

}
