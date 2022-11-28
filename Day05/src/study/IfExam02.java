package study;

/* 국어, 영어, 수학, 사회, 과학점수를 입력받아 총점과 평균을 구한 뒤,
 * 평균점수에 따라 등급을 평가하시오.
 * A는 평균 점수가 90점 이상
 * B는 평균 점수가 80점 이상
 * C는 평균 점수가 70점 이상
 * D는 평균 점수가 60점 이상
 * 평균 점수가 60점 이하면 F 처리 하시오.
 */

import java.util.*;

public class IfExam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		// 변수 선언
		int kor, eng, mat, soc, sci;
		int sum = 0; // 총점
		int avg = 0;
		// 점수 입력 시작
		System.out.print("국어점수 : ");
		kor = sc.nextInt();
		System.out.print("영어점수 : ");
		eng = sc.nextInt();
		System.out.print("수학점수 : ");
		mat = sc.nextInt();
		System.out.print("사회점수 : ");
		soc = sc.nextInt();
		System.out.print("과학점수 : ");
		sci = sc.nextInt();
		// 입력 끝
		
		sum = kor + eng + mat + soc + sci;
		// 총점
		avg = sum / 5;
		// 평균
		System.out.println("당신의 총점은 " + sum + "이고, 평균은 " + avg + "입니다.");
		
		char grade = ' ';
		// 등급판정
		if (avg>=90) {
			grade = 'A';
		} else if (avg>=80) {
			grade = 'B'; 
		} else if (avg>=70) {
			grade = 'C';
		} else if (avg>=60) {
			grade = 'D';
		} else {// 60점 이하(0~59)
			grade = 'F';
		}
		
		System.out.printf("당신의 등급은 %c 입니다.", grade);
		

	}

}
