package com.exec;

/*
 *  예외처리
 *  
 *  1. 프로그램 오류
 *  	- 프로그램이 실행 중 어떤 원인에 의해서 오작동을 하거나 비정상적으로 종료되는 경우를 오류라고 함
 *  
 *  	1-1. 컴파일에러 : 컴파일 시 발생하는 에러
 *  		- 문법적인 오류만 인식함
 *  
 *  	1-2. 런타임에러 : 실행 도중 발생하는 에러
 *  			에러: 프로그램 코드에 의해서 수습 될 수 없는 심각한 오류
 *  			예외: 프로그램 코드에 의해서 수습이 될 수 있는 미약한 오류
 *
 *  예외 발생 상황
 *  	- 정수를 0으로 나누는 경우
 *  	- 배열의 인덱스 값이 음수값을 가지거나, 크기를 벗어나는 경우
 *  	- 형변환이 잘못 된 경우
 *  	- 인터럽트가 발생하는 경우
 *  	- 입출력 시 파일이 존재하지 않는 경우
 *  	- 메소드 호출시 메소드가 존재하지 않는 경우
 *  	등등
 *  
 *  예외처리의 목적
 *  - 예외의 발생으로 인한 실행 중인 프로그램의 갑작스런 비정상 종료를 막고
 *  	정상적인 실행 상태를 유지 할 수 있도록 하는 것을 목적으로 한다
 *  
 *  예외의 구문
 *  	try{
 *  
 *  	}catch(예외 타입1 매개변수1){
 *  		예외가 발생했을 때 처리하는 코드 작성
 *  	}catch(예외 타입2 매개변수2){
 *  		예외가 발생했을 때 처리하는 코드 작성
 *  	}finally{
 *  		예외와 상관없이 무조건 실행하는 코드 작성
 *  	} 
 */

public class ExceptionEx01 {

	public static void main(String[] args) {
		
		int num = 50;
		int result = 0;
		
		for(int i=0; i<10; i++) {
			try {
			result = num / (int)(Math.random() *5);
			System.out.println(result);
			}catch(ArithmeticException ae) {
			//	System.out.println("Exception 발생...");
				System.out.println(ae.getMessage());
			}
			
		}
	}

}
