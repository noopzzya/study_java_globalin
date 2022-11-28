package com.exam;

import java.util.*;

public class WhileEx03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a,b;
		
		while(true) {
			System.out.print("두 정수 입력 : ");
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println("두 정수의 합계 : " + (a + b));
		}

	}

}
