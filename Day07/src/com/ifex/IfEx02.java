package com.ifex;

/* 문]
 *  사용자로부터 알파벳 한 문자를 입력받아
 *  대문자  ==> 소문자, 소문자 ==>대문자로 변환하는 프로그램 작성
 */

import java.io.*;
public class IfEx02 {

	public static void main(String[] args) throws IOException {

		// 변수선언
		char ch;
		int n;
		
		System.out.print("알파벳 한 문자 입력 : ");
		n = System.in.read();
		
		//System.out.println(n);
		
		if(n >= 65 && n <= 90) { //입력값이 대문자라면
			/* A(65) --> a(97) --> +32
			 * a(97) --> A(65) --> -32
			 */
			n+=32;
			ch = (char) n;
			System.out.println(ch);
		}else if(n >= 97 && n <= 122) {
			n-=32;
			ch = (char) n;
			System.out.println(ch);
		}else {
			System.out.println("입력오류");
		}
		
	}

}
