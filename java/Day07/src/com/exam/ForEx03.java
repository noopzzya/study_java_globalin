package com.exam;

/*
 * 	무한대로 두 정수를 입력받아 합계를 구하는 프로그램 작성
 * 종료 조건 : 첫 번째 정수가 0보다 작을 경우
 */

import java.util.*;
public class ForEx03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1,n2;
		
		for(;;) {
			System.out.print("첫 번째 정수 입력: ");
			n1 = sc.nextInt();
			if(n1<0) break;
			
			System.out.print("두 번째 정수 입력: ");
			n2 = sc.nextInt();
			System.out.println("합계" +(n1+n2));
			
//			System.out.print("두 정수 입력: ");
//			n1 = sc.nextInt();
//			if(n1<0) break;
//			
//			n2 = sc.nextInt();
//			System.out.println("합계" +(n1+n2));
//			
			
		}
		
		
	}

}
