package com.classex;

import java.util.*;
public class Sungjuk {
	
	int n; // 인원수 입력받을 필드
	
	// 객체 배열 선언
	Record[] re;
	Scanner sc = new Scanner(System.in);
	
	//인원 설정 메소드 
	void set() {
		do {
			System.out.print("인원수 입력(1~100) : ");
			n = sc.nextInt();
		}while(n<1 || n>100);
		
		re = new Record[n]; // 객체 배열 생성
	}
	
	void input() { // 입력받아서 처리하고 계산하는 메소드
		for(int i=0; i<re.length; i++) 
		{
			re[i] = new Record();
			// 이름입력
			System.out.print((i+1) +"번째 이름 입력:");			
			re[i].name = sc.next();
			
			// 국어, 영어, 수학 점수 입력
			System.out.print("국어 점수입력:");				
			re[i].kor = sc.nextInt();
			System.out.print("영어 점수입력:");				
			re[i].eng = sc.nextInt();
			System.out.print("수학 점수입력:");				
			re[i].mat = sc.nextInt();
		}
		
		// 총점과 평균
		for(int i=0; i<re.length; i++) {
			re[i].tot = re[i].kor +  re[i].eng +  re[i].mat;
			re[i].avg = (double)re[i].tot / 3.0;
		}
		
		// 석차계산
		for(int i=0; i<re.length; i++ ) 
			for(int j=0; j<re.length; j++) 
				if(re[i].avg < re[j].avg)
					re[i].rank++;
					
		
	}
	
	void output() { // 출력 메소드
		System.out.println();
		System.out.printf("이름  국어  영어 수학  총점  평균  석차\n");
		for(int i=0; i<re.length; i++) {
			System.out.printf("%s   %3d %3d %3d %3d %.2f %3d\n",
				re[i].name, re[i].kor, re[i].eng, re[i].mat, re[i].tot, re[i].avg, re[i].rank);
		}	
	}
	
}
