package com.exam;

import java.util.Scanner;

public class DoWhileEx04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n, sum=1; //곱하기는 0하면 안됨!
		
		System.out.print("정수 입력 : ");
		n=sc.nextInt();
		int i=1 ;
		
		 do{
			sum *=i;
			i++;
			
		}while(i<=n);
			System.out.println(n+"의 팩토리얼은" +sum+"입니다.");

	}

}
