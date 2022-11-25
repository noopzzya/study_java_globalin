package com.ex;
	
/* 문]
 * 2차원 배열을 ㅣ용하여 다음과 같이 출력하시오.
 * 
 * 1
 * 1 2 3
 * 1
 * 1 2 3 4
 * 1 2
 * 
 */

public class ArrayEx01 {

	public static void main(String[] args) {
		
		int n[][] = { // 배열의 선언 및 초기화
				{1},
				{1,2,3},
				{1},
				{1,2,3,4},
				{1,2}
		};
		
		// 출력
		for(int i=0; i<n.length; i++) {
			for(int j=0; j<n[i].length; j++) {
				System.out.printf("%3d", n[i][j]);
			}
			System.out.println();
		}
	}

}
