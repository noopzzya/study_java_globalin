package com.ex;

/* 문]
 * 		5개의 정수를 입력받고 그 중 양수들만의 합계를 출력하는 프로그램작성
 * 		단, 0이나 음수가 입력되면 continue 문을 이용하여 넘어간다.
 */

import java.util.*;
public class Ex03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum=0;
		System.out.print("정수 5개 입력:");
		
		for(int i=0 ; i<5 ; i++) {
			int n = sc.nextInt();
			
			if(n<=0)
				continue;
			else
				sum += n;
		}
		System.out.println("합계"+sum);
		
	
	}

}
