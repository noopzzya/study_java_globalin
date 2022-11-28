package exam;

import java.util.*;

public class IfExam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		System.out.print("정수 입력 : ");
		a = sc.nextInt();
		
		if(a%2==0) { // a를 2로 나누어 나머지 0이면
			System.out.println("짝수를 입력 했군요...");
		} else {
			System.out.println("홀수를 입력 했군요...");
		}

		String value;
		value = (a%2==0) ?  "짝수" :  "홀수";
		
		System.out.println("당신이 입력 정수는 " + value + "입니다.");
		
	}

}
