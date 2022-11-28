package exam;

import java.util.*;

public class Exam06_1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num, count = 0;
		
		System.out.print("1 ~ 99 사이의 정수를 입력하시오. >> ");
		num = sc.nextInt();
		
		if(num>= 1 && num <= 99) {
			int a, b; // a = 10의 자리, b는 1의 자리
			a = num / 10; // 10의 자리에서 3, 6, 9 검사
			b = num % 10; // 1의 자리에서 3, 6, 9 검사
			
			if(a!=0 && a%3 == 0)
				count++; // count = count + 1;
				// 10의 자리 정수 중에 3, 6, 9 중 하나가 존재하는 count를 증가
			if(b!=0 && b%3 == 0)
				count++;
				// 일의 자리 정수 중에 3, 6, 9 중 하나가 존재하는 count를 증가
			
			
			if (count ==2) {
				System.out.println("박수짝짝");
			} else if (count ==1) {
				System.out.println("박수짝");
			} else {
				System.out.println("박수가 없음");
			}
			
		}else {
			System.out.println("숫자가 범위를 벗어났습니다.");
		}
		

	}

}
