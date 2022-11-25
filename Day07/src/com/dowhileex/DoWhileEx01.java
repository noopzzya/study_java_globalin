package com.dowhileex;

/* 문]
 * 1에서 10까지 덧셈을 표시하고 합계를 출력하는 프로그램을 작성하시오.
 * ex) 1+2+3+4+5+6+7+8+9+10=55
 */

public class DoWhileEx01 {

	public static void main(String[] args) {
		
		int i=1, sum=0;
		
		do {
			sum = sum+i;
			i++;
			
		}while(i<=10);
		System.out.println("1부터 10까지의 합계 :"+sum);

	}

}
