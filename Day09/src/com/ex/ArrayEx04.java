package com.ex;

/* 문]
 * 
 * 정수 10개를 저장 할 배영을 선언하고 1~10까지의 범위의 정수를 랜덤으로 생성하여
 * 배열에 저장하고, 저장 된 배열을 숫자들과 평균을 출력하는 프로그램을 작성하시오.
 * 
 * hint)
 * 1에서부터 10까지의 정수를 랜덤하게 생성하는 코드
 * int i = (int)(Math.random()*10+1);
 * 
 */


public class ArrayEx04 {

	public static void main(String[] args) {
		
		// 배열선언
		int[] n = new int[10];
		
		// 10개의 랜덤한 정수를 생성해서 배열에 저장
		for(int i=0; i<n.length; i++) {
			int r = (int)(Math.random()*10+1);
			n[i] = r; //랜덤으로 생성한 정수를 배열에 저장
			//System.out.print(n[i]+"\t");
		}
		
		// 합계를 구함
		int sum = 0;
		for(int i=0; i<n.length; i++) {
			sum +=  n[i];
		}
		
		// 랜덤한 정수 출력
		for(int i=0; i<n.length; i++) {
			System.out.print(n[i] + "\t");
		}
		
		System.out.println();
		// 평균 출력
		System.out.println("평균:" +(double)sum/n.length);
	}

}
