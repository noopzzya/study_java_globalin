package com.exam;

/*문9]
	찬수 학생은 다음 3개의 필드와 메소를 가진 4개의 클래스
	Add, Sub, Mul, Div를 작성하시오.
	
	필드 정의
	피연산자 : 2개
	메소드 정의 :  void setValue (int a, int b) : 피연산자 값을 객체 내에 저장 (set : 저장, get : 가져오는 것)
	연산처리와 실행 결과를 리턴하는 메소드를 정의
	int calculate();
	
	출력
	두 정수와 연산자 입력 : 5 7 +
	12
 */

public class Add {

	private int a, b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public int calculate() {
		return a + b;
	}
	
}
