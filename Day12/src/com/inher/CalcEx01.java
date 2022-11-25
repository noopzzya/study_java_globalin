package com.inher;

import java.io.*;
public class CalcEx01 {

	public static void main(String[] args) throws IOException {
		
		BClass bc = new BClass();
		
		if(!bc.input()) { // "return false" 일 경우 "Error"
			System.out.println("Error!!!!");
			return;
		} // 입력 기능 끝
		
		// 계산 기능 호출
		double result = bc.calc();
		bc.write(result);
	}
}
