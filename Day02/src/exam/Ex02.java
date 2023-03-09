package exam;

/*	문2.
 * 		문자열을 이용하여 이름을 출력하시오.
 */

import java.io.*;

public class Ex02 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		String name;
		
		System.out.println("이름 입력  :");
		name = br.readLine();
		System.out.println(name);

	}

}