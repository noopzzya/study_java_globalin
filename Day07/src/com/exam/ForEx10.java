package com.exam;

/* 문] 
 * 		입력한 정수의 평균을 구하는 프로그램을 작성하시오.
 * 		1. 사용자로부터 정수의 개수를 입력받는다
 * 		2. 입력받은 수만큼 평균을 구한다.
 * 		3. 입력된 값은 정수, 출력은 실수값으로 처리하시오.
 */

import java.util.*;
public class ForEx10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cnt, num, i, sum=0;
		double avg=0;
		System.out.print("정수 개수 입력:");	
		cnt=sc.nextInt();
		
		for(i=1; i<=cnt; i++) {
			System.out.print("정수입력:");
			num=sc.nextInt();
			sum += num;
		}
		avg = sum/(double)cnt; //나눠지는 수를 실수로 바꿔야 실수계산
		System.out.printf("평균은 %.1f\n", avg);
	}

}
