package com.ex;

/* 문]
 * 
 * 정수를 몇 개 저장 할 지 키보드로 개수(100)를 입력받아 정수 배열을 생성하고,
 * 1~100까지의 범위의 정수를 랜덤으로 저장하고
 * 배열에 같은 수가 없도록 배열값을 출력하는 프로그램을 작성하시오.
 * 
 * public static boolean exists(int a[], int from
 * 
 */

import java.util.*;
public class ArrayEx05 {

	public static boolean exists(int a[], int from, int r) {
		
		for(int j=0; j<from; j++) {
			
			if(a[j] == r) {
				return true; // 같은 때를 true를 리턴
			}
		}
		return false; // 같지 않은 경우 false 리턴
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("정수 몇 개:");
		int n = sc.nextInt();

		if(n<=0 || n>100) {
			System.out.println("1~100 입력");
			//System.exit(0);
			return; // 프로그램 종료
		}

		int arr[] = new int[n]; // 배열의 크기

		for(int i=0; i<arr.length; i++) {
			int r = (int)(Math.random()*100 + 1);
			// 랜덤으로 나온 숫자를 비교한다
			if(exists(arr,i,r))
			{
				i--;
				continue;
			}
			arr[i] = r;
		}

		for(int i=0; i<arr.length; i++) {
			if(i % 10 == 0)
				System.out.println();
			System.out.print(arr[i]+"\\t");
		}
	}
}
