package exam;

/* 문]
 *     Scanner 클래스를 이용하여 삼각형의 변의 길이를 나타내는 정수 3개를 입력
 *     이 3개의 수로 삼각형을 만들 수 있는지를 판별하는 프로그램을 작성하시오.
 *     
 *     삼각형 성립 조건) 삼각형이 되려면 두 변의 합이 다른 한변의 합보다 커야함
 *     
 *     정수 3개를 입력하시오. >> 4 3 5
 *     삼각형입니다.
 */

import java.util.*;

public class Exam05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		System.out.print("정수 3개를 입력하시오. >> ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		if ((n1 + n2)<n3 || (n1 + n3)<n2 || (n2+n3)<n1) {
			System.out.println("삼각형을 만들 수 없습니다.");
		} else {
			System.out.println("삼각형 입니다.");
		}

		

	}

}
