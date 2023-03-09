package exam;

/*	문8.
 * 		문자 하나를 입력받아 아스키 코드로 출력하는 프로그램 작성하시오.
 */

import java.io.*;

public class Ex08 {

	public static void main(String[] args) throws IOException {
		
		System.out.print("문자 하나입력:");
		int num = System.in.read();
		
		System.out.println("아스키 코드 값은 : "+num);
	}

}
