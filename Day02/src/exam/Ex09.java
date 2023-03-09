package exam;

/*	문9.
 * 		문자열 Hello World를 입력받아 출력하는 프로그램을 작성하시오.
 */

import java.io.*;

public class Ex09 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("문자열 입력:");
		String s = br.readLine();
		System.out.println("입력받은 문자열은 :"+s);
		

	}

}
