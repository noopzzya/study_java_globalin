package com.exam;

/* 문]
 * -50에서 1까지의 수를 출력하는 프로그램을 작성하시오.
 * 	단, 한줄에 5개의 수만 출력, 수들 사이 탭간격으로 출력
 */

public class WhileEx09 {

	public static void main(String[] args) {
				
		int i=-50;
		while(i<=1) {
			System.out.printf("%d\t",i);
			i++;
			
			if(-i % 5==0)
				System.out.println();
		} 	
		

	}

}
