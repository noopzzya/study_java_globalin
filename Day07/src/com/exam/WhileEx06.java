package com.exam;

/* while 문 사용
 * 
 * 문] 사용자로부터 입력하는 정수를 계속해서 더한다.
 * 		만약 0이 입력되면 지금까지의 정수를 더하여 결과를 출력하시오. 
 */

import java.util.*;
public class WhileEx06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n=1, sum=0;
		
		while(n!=0) {
			System.out.print("정수입력, 0.종료:");
			n=sc.nextInt();
			
			sum +=n;
		}
		System.out.println(sum);
	}

}
