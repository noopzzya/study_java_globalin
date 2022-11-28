package exam;

/* Scanner 클래스로 정수 3개를 입력받고 그 중 중간 크기의 수를 출력하는 프로그램을 작성하시오.
 *  정수 3개 입력 >> 20 100 33
 *  중간 값은 33
 * 
 */

import java.util.*;

public class Exam04 {

	public static void main(String[] args)  {
		

		Scanner sc = new Scanner(System.in);
		
		int num1, num2, num3;
		
		System.out.print("정수 3개 입력 >> ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		int mid = num1;
		
		if (num2 >= num1 && num2 <= num3 ) {
			mid = num2;
		} else if (num2 <= num1 && num2 >= num3) {
			mid = num2;
		} else if (num3 >= num1 && num3 <= num2){
			mid = num3;
		} else if (num3 <= num1 && num3 >= num2) {
			mid = num3;
		}else {
			System.out.println("값을 확인해주세요.");
		}
		System.out.printf("중간 값은 %d\n", mid);
		
	}

}
