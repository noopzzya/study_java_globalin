package study;

/* 문자열 입력받기
 * InputStreamReader isr = new InputStreamReader(System.in);
 * BufferedReader br = new BufferedReader(isr);
 * 
 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 */

import java.io.*;
import java.io.InputStreamReader;

public class InputEx03 {

	public static void main(String[] args) throws IOException {
		
		 InputStreamReader isr = new InputStreamReader(System.in);
		 	BufferedReader br = new BufferedReader(isr);
		 	
		 System.out.print("이름 입력:");
		 String name = br.readLine();
		 
		 System.out.print("나이 입력:");
		 String nai = br.readLine();
		 
		 System.out.print("주소 입력:");
		 String addr = br.readLine();
		 
		 System.out.print("전번 입력:");
		 String tel = br.readLine();
		 
		 System.out.println("나의 이름은" + name + "이고");
		 System.out.println("나이는 방년" + nai + "이며");
		 System.out.println("집은" + addr + "살고");
		 System.out.println("연락처는" +tel + "입니다");
		 
		 	
	}

}
