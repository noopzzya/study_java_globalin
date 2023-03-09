package study;

import java.io.*;

public class InputEx02 {

	public static void main(String[] args) throws IOException{

		// 숫자 하나 입력받기
		int num1; //첫 번째 숫자
		int num2; //두 번째 숫자
		
		System.out.print("첫번째 정수 입력:");
		num1 = System.in.read() -'0'; // 5=>53 - 48 = 5
		System.in.read();
		System.in.read();
		
		System.out.print("두번째 정수 입력:");
		num2 = System.in.read() -'0'; // 7=>55 - 48 = 7
		System.out.println("num1 + num2 :"+(num1+num2));
	}

}
