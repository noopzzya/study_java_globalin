package com.exam;

/* 문] 
 * 		두 개의 정수를 입력받아서 그 사이에 존재하는 정수들의 합을 구하는 프로그램 작성
 * 		ex) 3 5 >> 3+4+5 +12
 * 		ex) 5 3 >> =12
 * 		* 큰 숫자부터 입력 시 합계 오차 발생 > if문으로 설정해야함
 */

import java.util.*;
public class ForEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1,n2, sum=0;
		
		System.out.print("첫 번째 정수 입력: ");
		n1 = sc.nextInt();

		System.out.print("두 번째 정수 입력: ");
		n2 = sc.nextInt();
		
		if(n1>n2) { //if문 없을 경우 합계:0 > 첫번째정수가 클 경우만 실행
			n1 = n1^n2;
			n2 = n2^n1;
			n1 = n1^n2;
		}
		
		for(int i=n1; i<=n2 ; i++) {
			sum +=i;

		}
		System.out.println("합계: " +sum);
	}
}
