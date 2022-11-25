package arrayexam;

/*문]
 *   	사용자로부터 임의의 정수를 임의의 개수만큼 입력받아
 *   	입력받은 수 중 가장 큰 수를 출력하는 프로그램
 *   	
 *   	단, 배열로 구현하시오.
 *   	
 *   	입력 할 개수 : 9
 *   	데이터 입력[공백구분] : 4 7 9 1 3 2 5 6 8
 *   	가장 큰 수 : 9
 *   
 *   	int[] aa = new int[n]   
 */	

import java.util.*;
public class ArrayEx06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("입력 할 개수:");
		n = sc.nextInt();
		// 배열 선언
		int[] aa = new int[n];
		System.out.print("데이터 입력[공백구분] : ");
		for(int i=0; i<aa.length; i++) 
		{
			aa[i] = sc.nextInt();
		}
		
		int max = 0;
		for(int i=0; i<aa.length; i++) 
		{
			if(aa[i] > max)
				max = aa[i];
		}
		System.out.println("가장 큰 수:" +max);
	}

}
