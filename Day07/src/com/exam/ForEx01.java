package com.exam;

/* 문]
 * 0부터 입력한 정수의 합을 구하라
 * 입력 Scanner 클래스로 구현
 */

import java.util.*;

public class ForEx01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		int sum=0, n;
		
		System.out.print("정수입력 : ");
		n=sc.nextInt();
		
		for(int i = 0; i<=n; i++) {
			sum += i;
		}
		System.out.printf("0부터 %d까지의 합계: %d", n,sum);
	}

}
