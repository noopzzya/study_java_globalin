package s_exam;

import java.util.*;

public class Ex07 {
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		String name, addr, phone;
		
		System.out.print("이름입력:");
		name = sc.nextLine();
		System.out.print("주소입력:");
		addr = sc.nextLine();
		System.out.print("전번입력:");
		phone = sc.nextLine();
		
		System.out.println("당신이 입력한 이름은 " +name+ "이며, 주소는 " +addr+ "이고 전화번호는 " +phone+"입니다");
		
	}
}
