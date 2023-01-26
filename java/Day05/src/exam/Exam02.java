package exam;

/* 문]
 *      사용자로부터 임의의 년도를 입력받아 윤년인지 평년인지를 판별하는 프로그램을 작성하시오.
 *      
 *      윤년 >>> 년을 4로 나누어서 떨어진다. 
 *                    년 400으로 나누어 떨어진다.
 *                    년을 100으로 나누어 떨어지지 않으면 됨
 *                    
 *      평년 >>> 윤년을 제외한 나머지              
 */

import java.util.*;

public class Exam02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("윤년/평년 판독기 : ");
		int year = sc.nextInt();
		
		if (year%4 == 0 || year%400 == 0 && year%100 != 0) {
			System.out.println("윤년입니다.");
		}else {
			System.out.println("평년입니다.");
		}

	}

}
