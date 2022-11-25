package com.whileex;

public class WhileEx01 {

	public static void main(String[] args) {
		
		// 변수 선언 및 초기화
		int i = 0, sum = 0;
		i=0;
		while(i<=10) {//조건식
			// i가 증가할 때마다 누적
			//System.out.println(i);
			sum = sum+i;			
			i++;
			//증감식
		}
		System.out.println("1부터 10가지의 합계 :"+sum);
	}

}
