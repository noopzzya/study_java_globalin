package exam;

/* 문]
 *     세 개의 정수를 입력받아 큰 순서대로 출력하는 프로그램을 작성하시오.
 */

import java.io.*;

public class IfExam04 {

	public static void main(String[] args) throws IOException{
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		int first, second, third;
		int temp = 0;
		
		System.out.print("첫번째 정수 입력 : ");
		first = Integer.parseInt(br.readLine());
		System.out.print("두번째 정수 입력 : ");
		second = Integer.parseInt(br.readLine());
		System.out.print("세번째 정수 입력 : ");
		third = Integer.parseInt(br.readLine());
		
	
		// swap 공식이용
		
		/*
		 * if(second>=first && second>=third) { temp = first; first = second; second =
		 * temp; } else if(third>=first && third>=second) { temp = first; first = third;
		 * third = temp; }
		 * 
		 * if(third>=second) { temp = second; second = third; third = temp; }
		 */
		
		// xor
		
		if(first<second) { // 첫번째 정수가 두번째 정수보다 큰 경우
			first = first^second;
			second = second^first;
			first = first^second;
		}
		
		if(first<third) { // 첫번째 정수가 세번째 정수보다 큰 경우
			first = first^third;
			third = third^first;
			first = first^third;
		}
		
		if(second<third) { // 두번째 정수가 세번째 정수보다 큰 경우
			second = second^third;
			third = third^second;
			second = second^third;
		}
		
		System.out.println(first + ">=" + second + ">=" + third);
		
		
	}

}
