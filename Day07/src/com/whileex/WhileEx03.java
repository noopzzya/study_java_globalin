package com.whileex;

/*
 *  while : 종료값이 주로 명확하지 않을 때 주로 사용
 *  
 *  문]
 *  	while 문을 이용하여 -1이 입력 될 때까지 정수를 계속 입력받아
 *  	합계와 평균을 구하는 프로그램을  작성하시오
 *  
 */

import java.util.*;

public class WhileEx03 {

	public static void main(String[] args) {
		//스캐너 객체 생성
		Scanner sc = new Scanner(System.in); 
		
		// 변수의 선언과 초기화
		int cnt = 0; // 입력된 정수의 개수를 저장하는 변수
		int n; // 입력받은 정수를 저장할 변수
		int sum = 0; // 누적의 합을 저장할 변수
		
		//입력 안내 메시지 출력
		System.out.print("정수를 입력하고 마지막에 -1을 입력하세요 : ");
		n = sc.nextInt();
		
		while(n !=-1) {
			sum += n;
			cnt++; //카운트증가
			System.out.print("정수를 입력하고 마지막에 -1을 입력하세요 : ");
			n=sc.nextInt(); //정수입력
		}
		
		if(cnt == 0) {
			System.out.println("입력된 수가 없습니다.");
		}else {
		System.out.println(cnt);
		System.out.println("합계는 " +sum+ "이고, 평균은 "+(double)sum/cnt);
		}
	}

}
