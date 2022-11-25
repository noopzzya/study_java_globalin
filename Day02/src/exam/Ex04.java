package exam;

/*	문4.
 * 		임의의 두 정수를 입력받아 합을 구하는 프로그램을 작성하시오.
 */


import java.io.*;

public class Ex04 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		int a, b, c;
		
		System.out.print("첫번재 정수 입력");
		a = Integer.parseInt(br.readLine());
		
		System.out.print("두번째 정수 입력");
		b = Integer.parseInt(br.readLine());
		//두 수의 합
		c = a+b;
		
		System.out.println("두 정수의 합 : " +c);
		
	}

}
