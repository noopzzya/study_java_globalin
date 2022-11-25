package com.ex;

/* 문]
 * 		배열과 반복문을 이용하여 다음을 프로그램 하시오.
 * 		키보드로 정수 입력
 * 		돈의 액수를 입력받아 오만원권, 만원권, 천원권, 오백원, 백원, 오십원, 10원, 1원
 * 		각각 몇개인지를 변환하는 프로그램을 작성
 * 		단, 반드시 배열과 반복문을 이용하시오.
 */	

import java.util.*;
public class ArrayEx03 {

	public static void main(String[] args) {
		
		int unit[] = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액 입력:");
		int money = sc.nextInt();
		
		for(int i=0; i<unit.length; i++) {
			// 돈의 개수 계산
			int res = money / unit[i]; // 오만원권 개수
			//System.out.println(res);
			
			// 몫 계산
			if(res > 0) { // 몫이 있을 경우
				System.out.println(unit[i] +"원 짜리:" +res+ "개");
				money = money % unit[i]; // money 갱신
			}
		}		
	}
}
