package com.inher;

/* 메소드 오버라이딩
 * 		-메소드 이름, 리턴타입, 파라미터 수나 타입이 완전히 일치해야만 한다.
 * 		-반드시 상속 관계에 있어야함
 * 		-재정의 된 하위 클래스의 메소드 접근변경자는 상위클래스 메소드의 접근변경자 보다 범위가 크거나 같아야한다.
 * 		-final, private 메소드는 오버라이딩 불가  
 */

public class SuperEx { // 부모클래스

	private int a = 5;
	protected int b = 10;
	public int c = 20;
	
	public void write() {
		System.out.println("SuperEx write() 메소드 : " +a+ ":" +b+ ":" +c);
	}
	
}
