package exam;

import java.util.*;

public class Exam04_1 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		int n1, n2, n3;
		System.out.print("정수 3개 입력 >> ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		n3 = sc.nextInt();
		
		int mid = n1;
		
		if ((n1 >= n2 && n1 <= n3)||(n1>=n3 && n1 <= n2)) {
			mid = n1;
		}else if ((n2 >= n1 && n2 <= n3)||(n2>=n3 && n2 <=n3)) {
			mid = n2;
		}else {
			mid = n3;
		}
		
		System.out.println("중간 값은 " + mid);
	} 

}
