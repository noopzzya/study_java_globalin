package com.exec;

import java.io.IOException;

/*
 * throws 예약어 : 예외 전가
 * 	[접근제한자] 반환형 메소드명(매개변수, 매개변수, ...) throws 예외클래스1, 예외클래스2
 */

import java.io.*;
public class ExceptionEx05 {
	
	public void input() throws IOException, Exception{
		
	}
 
	public static void main(String[] args)throws IOException, Exception {
		ExceptionEx05 ee = new ExceptionEx05();
		ee.input();

	}

}
