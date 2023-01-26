package study;

import java.util.*;

public class IfExam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 입력 : ");
		int jumsu = sc.nextInt();
		
		if(jumsu>=80) {
			System.out.println("축하 합니다. 이번 시험에 합격 하셨습니다.");
		}
		
		
		if(jumsu%2==0) {
			System.out.println("짝수 입니다.");
		}else {
			System.out.println("홀수 입니다.");
		}
			
		

	}

}
