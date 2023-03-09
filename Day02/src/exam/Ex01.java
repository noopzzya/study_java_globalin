package exam;

/*	문1.
 * 		문자 하나를 입력받아 출력하는 프로그램 작성
 */

import java.io.*;

public class Ex01 {

	public static void main(String[] args) throws IOException{ //예외전가		
		
		System.out.print("하나의 문자 입력:");
		char a = (char)System.in.read();
		
		System.out.println("입력 받은 문자 : "+a);
			
	}
}
