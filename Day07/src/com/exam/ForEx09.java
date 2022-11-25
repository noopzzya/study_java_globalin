package com.exam;

/*
 * 사용자로부터 하나의 숫자를 입력받은 다음, 그 수만큼 3의 배수를 출력하는 프로그램을 작성하시오.
 * 	8
 *	3 6 9 12 15 18 21 24
 */

import java.util.*;
public class ForEx09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int i, num;
		
		System.out.print("숫자입력:");		
		num=sc.nextInt();
		
		for(i=1; i<=num; i++) {
			System.out.print(i*3+"\t");
		}
		
	}

}
