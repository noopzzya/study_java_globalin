package exam;

/* 문]
 *     임의의 정수 두개를 입력받아 큰 수를 알아 맞히는 프로그램을 작성하시오
 */

import java.io.*;

public class IfExam03 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		// 변수 선언
		int first, second;
		
		// 입력 안내 메시지
		System.out.print("첫번째 정수 입력 : ");
		first = Integer.parseInt(br.readLine());
		System.out.print("두번째 정수 입력 : ");
		second = Integer.parseInt(br.readLine());
		
		// int big = first;
		
		// 정수 두개를 비교
		
		if(first>second) {
			System.out.print("첫번째 수(" + first + ")");
			System.out.println("가 두번째 수(" + second + ") 보다 큰 수 입니다.");
		}else {
			System.out.print("첫번째 수(" + first + ")");
			System.out.println("가 두번째 수(" + second + ") 보다 작은 수 입니다.");
		}
		
		// if(big<second) {	big = second;}
		
		// System.out.println(big);
		

		
	}

}
