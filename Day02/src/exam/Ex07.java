package exam;

/*	문7.
 * 		이름과 주소와 전화번호를 입력받아 출력하는 프로그램을 작성하시오.
 */

import java.io.*;

public class Ex07 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
		
		//변수선언
		String name, address, phone;
		
		System.out.print("이름 입력:");
		name = br.readLine();
		System.out.print("주소 입력:");
		address = br.readLine();
		System.out.print("전번 입력:");
		phone = br.readLine();
		
		System.out.println("당신이 입력한 이름은" +name+"이며, 주소는"+address+"이고"+"전화번호는"+phone+"입니다");

	}

}
