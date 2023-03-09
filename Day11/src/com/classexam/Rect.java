package com.classexam;

import java.util.Scanner;

/* 사각형 클래스 설계
 * 
 * 넓이와 둘레를 계산하는 프로그램을 표현
 * 
 * 1. 클래스 정의 : rect
 * 2. 클래스의 속성(필드) : - 가로, 세로 (넓이, 둘레, 무게, 색깔, ...)
 * 3. 클래스의 기능(메소드) : - 넓이계산, 둘레계산, 가로/세로 입력, 결과 출력
 * 
 * 객체의 구성 : 속성(필드, 변수) +기능(메소드, 동작, 행위)
 * 클래스 구성 :          변수     +        메소드
 *  
 * 
 */

public class Rect { // 사각형 클래스 설계

	// 변수선언 (가로/세로)
	
	// 전역변수(공유변수, 클래스 변수) : 클래스 안에서 전부 사용 가능한 변수	
	// 멤버변수 - 클래스의 소속되어 있는 변수
	// 인스턴스 변수 : 인스턴스 생성될 때 사용가능한 변수
	//					 new 연산자의 의해서 메모리가 생성되었을 때 사용가능한 변수
	
	int w, h; 
	
	// 기능 정의 (메소드) 입력기능
	// [void]는 메소드 실행 후 메소를 호출한 곳에 결과를 돌려 줄 필요가 없을 때 지정하여 사용
	public void input() {
		// 수행 할 일
		
		Scanner sc = new Scanner(System.in);
		// 스캐너 인스턴스 생성
		System.out.print("가로입력:");
		w = sc.nextInt();
		System.out.print("세로입력:");
		h = sc.nextInt();
	}
	
	/*
	 * 메소드 정의(넓이 계산)
	 * 메소드 실행 후 결과가 정수인 경우를 지정하기 위해
	 * 리턴 자료형은 int형으로 함
	 */
	
		int area() {
			int result;
			result = w*h;
			return result;
		}
	
	/*
	 * 메소드 정의(둘레 계산)
	 * 메소드 실행 후 결과가 정수인 경우 지정하기 위해
	 * 리턴 자료형은 int형으로 함
	 * return 문을 통해서 메소를 호출한 곳으로 결과값을 돌려줌
	 * 
	 */
		int length() {
			int result;
			
			result = (w+h)*2;
			return result;			
		}
		
		
	/* 
	 * 메소드 정의 (결과 출력)
	 * 매개변수를 통해서 데이터를 넘겨 받음
	 *	메소드의 매개변수는 메소드 내에서만 사용가능
	 * 매개변수 선언 시 각각의 변수마다 자료형을 다로 지정해야함
	 */
		//area=a, length=b;
		void output(int a, int b) {
			System.out.println("가로 : " +w);
			System.out.println("세로 : " +h);
			System.out.println("넓이 : " +a);
			System.out.println("둘레 : " +b);
		}
	
}
