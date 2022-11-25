package com.exam;

/* 문]
 * 		이중 중첩 반복문을 사용하여 다음과 같이 출력하시오.
 * 		for, while, do~While
 * 
 * 		*****
 * 		****
 * 		***
 * 		**
 * 		*
 * 
 */

public class ForEx07 {

	public static void main(String[] args) {
		int i,j;

//	(i=0; i<5; i++)	(j=0; j<5-i; j++)
//	(i=5; i>0; i--)(j=0; j<i; j++)
		
		for(i=5; i>=1; i--) {
			for(j=1; j<=i; j++) {	
				System.out.print("*");
			}System.out.println();
		}
	}

}


