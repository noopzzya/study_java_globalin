package com.objectex;

/*
 * 국어, 영어, 수학 과목 점수를 입력받아 Grade객체를 생성하고
 * 평균을 출력하는 프로그램을 작성
 * 필드 타입은 int 접근변경자 private 선언
 * average() 메소드를 작성하여 평균을 계산
 * 출력
 * 
 * 국어 영어 수학 점수 입력 : 10 20 30
 * 평균은 20
 */

import java.util.*;
public class Grade {

	private int kor;
	private int eng;
	private int mat;
	
	public Grade(int kor, int eng, int mat) {
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	public int average() {		
		return (kor+eng+mat)/3;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 영어 수학 점수 입력:");
		int kor = sc.nextInt();
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		Grade gd = new Grade(kor, eng, mat);
		System.out.println("평균은 "+gd.average());
		
	}

}
