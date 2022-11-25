package com.methodex;

/* 메소드 오버로딩
 * - 하나의 클래스에서 같은 이름을 가진 메소드가 여러개 정의되는 것을 의미함
 * - 같은 이름의 메소드에 인자가 다름(int a)(int a, int b)
 * - 인자가 다르다는 것은 개수가 다르거나, 자료형이 다르거나, 인수의 순서가 다른 것을 의미함
 *  	int a, String b
 *  	String b, int a
 *  
 *  - 같은 목적으로 비슷한 동작을 수행하는 메소드들을 모아 이름을 같게 만들어 일관성을 유지함에 있음
 *  
 *   	접근제한자    반환형    메소드명            (자료형 인자, 자료형 인자, ......)
 *   	(상관없음           )   (반드시 같아야함)  (반드시 다르게 해야함)
 * 
 */

// 비 오버로딩 
public class OverloadingEx01 {
	
	public void intLength(int a) {
		String s = String.valueOf(a);
		System.out.println("입력한 값의 길이 : " +s.length());
	}
	
	public void floatLength(float f) {
		String s = String.valueOf(f);
		System.out.println("입력한 값의 길이 : " +s.length());
	}
	
	public void stringLength(String str) {
		System.out.println("입력한 값의 길이 : " +str.length());
	}
	
	public static void main(String[] args) {
		
		OverloadingEx01 oe = new OverloadingEx01();
		oe.intLength(1000);
		oe.floatLength(3.14f);
		oe.stringLength("10000");
	}

}
