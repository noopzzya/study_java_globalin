package com.exam;

import java.util.Scanner;

public class DoWhileEx01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		int sum=0, n, i=0;
		
		System.out.print("정수입력 : ");
		n=sc.nextInt();
		
		do {
			sum +=i;
			i++;
		}while(i<=n);
		System.out.printf("0부터 %d까지의 합계: %d", n,sum);

	}

}
