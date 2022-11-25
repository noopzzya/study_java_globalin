package exam;

/*	문3
 * 		숫자 하나씩을 입력받는 프로그램을 작성하되, 두 개의 변수를 이용하여 합을 구하는 프로그램 작성 
 */

import java.io.*;

public class Ex03 {

	public static void main(String[] args) throws IOException{
		
		int a, b, c; // c = a+b, (a+b)a+b = (a+b);
		
		System.out.println("첫번째 정수 입력:");
		a = System.in.read() - '0';
		System.in.skip(2); //System.in.read();System.in.read();
		b = System.in.read() - 48;
		
		System.out.println("입력받은 두 정수의 합"+(a+b));
//		System.out.println((char)a);

		
	}
}
