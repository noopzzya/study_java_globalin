package com.exam;

import java.util.Scanner;

public class WhileEx02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float i=0.0f, sum=0.0f;
		int cnt=0;
		
		while(i>=0.0) {
			
			sum +=i;
			System.out.print("양의 실수 입력 : ");
			i=sc.nextFloat();			
			cnt++;
			
		}
		System.out.println("지금까지의 합계 : " +sum+ ", 평균 : "+sum/(cnt-1));

	}

}
