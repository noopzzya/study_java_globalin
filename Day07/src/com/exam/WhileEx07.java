package com.exam;

/*
 * 문] 2의 승수를 입력받아 값을 구하는 프로그램을 작성하시오.
 */

import java.util.*;
public class WhileEx07 {

	public static void main(String[] args) {
		
		int i=1, multi=1, n = 1;
		// multi : 곱하기 1, n : 초기값 = 1 = 2의0승
		Scanner sc = new Scanner(System.in);
		System.out.print("승수입력:");
		n = sc.nextInt();
		
		while(i<=n) {
			multi *=2; //multi=multi*2 >> 계산된 멀티값이 순환 (초기값 최초1번끝)
			i++;
		}
		
		System.out.println("2의" +n+ "승은" +multi+ "입니다");

	}

}
