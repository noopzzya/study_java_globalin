package com.ex;

import java.io.BufferedReader;

/* 문] 임의의 정수를 입력 : 10
 * 		1~10까지의 합계 : 55
 * 		계속 하시겠습니까? [y/n] : y
 * 
 * 		임의의 정수를 입력 : 100
 * 		1~100까지의 합계 : 5050
 * 		계속 하시겠습니까? [y/n] : n
 * 
 * 		단, 입력 정수의 범위는 1~1000까지 정함 
 */

//import java.util.*;
import java.io.*;
public class Ex02 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//		Scanner sc = new Scanner(System.in);
		
		// 변수 선언
		int n, tot=0;
		char ch;
		
		while(true) {
			
			do {
				System.out.print("임의 정수 입력:");
				n = Integer.parseInt(br.readLine());
			}
			while(n<1 || n>1000);
			//1부터 n까지의 누적 합계
			
			tot = 0;
			for(int i=1 ; i<=n ; i++)
				tot += i;
			
			System.out.println("1~ " +n+ "까지의 합계:" +tot);
			
			System.out.print("계속 하시겠습니까? [y/n]:");
			ch = (char)System.in.read(); //기본적으로 한글자 읽음 (Enter문자 포함)
			// y/Y 값이 아니라면 그만
			
			//입력받은 값이 y/Y이면 멈춘다. while문을 빠져 나간다.
			if(ch !='y' && ch !='Y')
				break;
			
			System.in.skip(2); //System.in.read() LF, CR값이 두개가 추가로 저장된 값을 스킵
		}

	}

}
