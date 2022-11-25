package com.inher;

import java.io.*;
public class BClass extends AClass{

	// 데이터 입력 기능(메소드)
	boolean input() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("첫번째 정수 입력:");
		x = Integer.parseInt(br.readLine());
		
		System.out.print("두번째 정수 입력:");
		y = Integer.parseInt(br.readLine());
		
		System.out.print("연산자 입력:");
		
		ch = (char)System.in.read();
		System.in.read();
		System.in.read();
		if(ch == '+' || ch == '-' || ch == '*' || ch == '/')
			return true;
		return false;		
	}
	
	
	// 연산 및 처리기능(메소드)
	double calc() {
		
		double result = 0;
		
		switch (ch) {
		case '+': result = x+y; break;
		case '-': result = x-y; break;
		case '*': result = x*y; break;
		case '/': result = x/(double)y; break;	 // 나누기 정확한 결과값을 위해 더블형변환
		}		
		return result;
	} 
	

}
