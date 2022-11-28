package com.absex;

interface Inter1 {
	public int getA();
}

interface Inter2 {
	public int getA();
}

interface Inter3 extends Inter1, Inter2 { // 다중상속 
	public int getData();
}


public class InterFaceEx02 implements Inter3 {

	int a = 100;
	
	public static void main(String[] args) {

		InterFaceEx02 ife = new InterFaceEx02();
		
		Inter1 it1 = ife;
		Inter2 it2 = ife;
		Inter3 it3 = ife;
		
		System.out.println(it1.getA());
		System.out.println(it2.getA());
		System.out.println(it3.getData());

	}

	@Override
	public int getA() {
		// TODO Auto-generated method stub
		return a;
	}

	@Override
	public int getData() {
		// TODO Auto-generated method stub
		return a+10;
	}

}

/* 추상클래스와 인터페이스의 차이점
 *		추상클래스는 단일 상속이다.
 *		인터페이스는 다중 상속이 가능하다.
 * 
 * 
 * 
 * 추상클래스와 인터페이스의 공통점
 * 		1. 객체를 생성 할 수 없다.
 * 		2. 상속에서 하위클래스를 통하여 객체를 생성할 수 있다.
 * 			즉, 메소드 재정의 해야
 * 
 */




