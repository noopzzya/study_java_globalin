package s_exam;

import java.util.*;

public class Ex05_06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int kor, eng, mat, sum = 0;
		
		System.out.print("국어점수");
		kor = sc.nextInt();
		System.out.print("영어점수");
		eng = sc.nextInt();
		System.out.print("수학점수");
		mat = sc.nextInt();
		
		sum = kor+eng+mat;
		
		System.out.println("세 과목 총점은:" + sum+ "입니다.");
		
		float avg = sc.nextFloat();
		System.out.printf("평균은 %.2f", avg);
		
	}

}
