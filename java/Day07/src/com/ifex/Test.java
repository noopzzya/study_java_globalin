package com.ifex;

/*
 * IfEx02 삼항연산자로
 */

import java.io.*;
public class Test {

	public static void main(String[] args) throws IOException {
		
		int n;
		
		System.out.print("알파벳 한 문자 입력 : ");
		n = System.in.read();
		
		n=	n >= 65 && n <= 90 ? n+32 : n-32;
		System.out.println((char)n);
		
		
	}

}
