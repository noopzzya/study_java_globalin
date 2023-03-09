package com.exam;

/* 문]
 * 		사용자로부터 임의의 정수를 입력받아 1부터 입력받은 수까지의 
 * 		전체합계와 짝수의 합, 홀수의 합을 각각 결과 값 출력
 * 		
 * 		ex) 50
 * 			1~10까지의 전체 합:55
 * 			1~10까지의 짝수 합:30
 * 			1~10까지의 홀수 합:25
 * 
 * 			1~50까지의 전체 합:1275
 * 			1~50까지의 짝수 합:650
 * 			1~50까지의 홀수 합:625
 * 
 * 		10단위로 출력해야함
 */

import java.util.*;
public class ForEx06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n, sum=0, even=0, odd=0;
		
		System.out.print("정수입력: ");
		n = sc.nextInt();
		System.out.println();
		
		for(int i=1; i<=n; i++) {
				if(i%2 == 0)
					even += i;
				else
					odd += i;
				sum +=i;
				//10단위 아닌 경우
				
				if(i==n) {
					System.out.println();
					System.out.println("1~" +i+ "까지의 짝수의 합계:" +even);
					System.out.println("1~" +i+ "까지의 홀수의 합계:" +odd);
					System.out.println("1~" +i+ "까지의 전체의 합계:" +sum);
					
				}else if(i % 10 ==0) {
					System.out.println();
					System.out.println("1~" +i+ "까지의 짝수의 합계:" +even);
					System.out.println("1~" +i+ "까지의 홀수의 합계:" +odd);
					System.out.println("1~" +i+ "까지의 전체의 합계:" +sum);
				}
					
				
		}
		
		
	

	}

}
