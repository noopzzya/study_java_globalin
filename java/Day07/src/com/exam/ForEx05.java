package com.exam;

/* 
 * 문]
 * 		사용자로부터 n이라는 수를 입력받아 n!을 계산하는 프로그램을 작성하시오.
 * 공식 : factorial : 5! = 1*2*3*4*5 = 120
 * 	
 */

import java.util.*;
public class ForEx05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, sum=1; //곱하기는 0하면 안됨!
		
		System.out.print("정수 입력 : ");
		n=sc.nextInt();
		
		for(int i=1;i<=n;i++) {
			sum *=i;
			System.out.println(n+"의 팩토리얼은" +sum+"입니다.");
		}
		
	}

}
