package study;

/*	원의 넓이 : 반지름 * 반지름 * 3.14
 * 	원의 둘레 : 반지름 * 2 * 3.14
 */

import java.util.*;

public class OperExam02 {

	public static void main(String[] args) {
		//System.out.println(Math.PI);
		
		Scanner sc = new Scanner(System.in);
		
		int r;
		double area=0.0, length=0.0;
		
		System.out.print("반지름 입력 : ");
		
		r = sc.nextInt();
		area = r*r*3.14;
		length = r*2*3.14;
		
		System.out.printf("원의 넓이 : %.2f\n",area);
		System.out.printf("원의 둘레 : %.2f", length);

	}

}
