package com.classex;

/* 메소드
 *	1.메소드 : 객체가 할 수 있는 동작을 정의하는 것이며 메소드 또한 instance메소드와 static메소드가 있다.
 *	
 * 2.메소드 구성
 *		[접근제한자] [반환형] [메소드명] (자료형 인자(매개변수)1, 자료형 인자2, ....) {
 *		처리문 (수행문)
 *		}
 *
 *		- 반환형
 *			- 메소드에서 해야 할 일들을 모두 마치고 마지막으로 메소드 자신을 불러준 곳 (메소드 호출)으로 반환하는 값의 자료형을 의미.
 *				만약 반환 값이 없다면 void로 대처한다.
 *				생략은 절대 불가능.
 *
 *		- 인자 (매개변수)
 *			Argument 라고도 하며 메소드를 호출 할 때 필요에 따라 특정 값을 제공하기 위해 미리 선언하는 것이다.
 *			메소드 호출 시에 반드시 인자의 자료형과 수가 일치해야한다.
 *				
 */

class MethodEx {
	
	// 메소드 정의
	public int sum(int i, int j) {
		//int res;
		//res = i+j;
		return i + j;
	}
	
	public int sub(int i, int j) {
		return i - j;
	}
	
	public int cob(int i, int j) {
		return i * j;
	}
	
	public int div(int i, int j) {
		return i / j;
	}
	
}

public class MethodEx01 {

	public static void main(String[] args) {
		
		MethodEx me = new MethodEx();
		
		int i = 10;
		int j = 10;
		
		// 메소드 호출
		int a = me.sum(i,j);
		int b = me.sub(20, 10);
		int c = me.cob(i, j);
		int d = me.div(i, j);
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
	}

}
