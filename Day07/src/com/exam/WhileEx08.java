package com.exam;

/*
 * -1^2+2^2-3^2+4^2-5^2+.....+100^2 의 합계를 구하는 프로그램을 작성하시오.
 * ^:승수표시
 * 홀수 : -, 짝수 : +
 */

public class WhileEx08 {

	public static void main(String[] args) {
		
		int i=1, sum=0, plus=1;
		
		while (i<=100) {
			plus = -plus;
			sum += plus*(i*i);
			i++;
//			-1^2=(-1)*1*1
//			 2^2=-(-1)*2*2
//			-3^2=(-1)*3*3
		}
		System.out.println("결과:"+sum);
	}

}
