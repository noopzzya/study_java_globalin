package com.exam;

/*	문]
 * 		1콜라, 2사이다, 3마운틴, 4초코송이, 5에이스, 6웨하스
 *		나오는 자판기 프로그램을 작성하시오.
 *		종료는 0번으로 해서 프로그램 완성.
 *		메뉴 입력 : Scanner
 *		while, switch~case
 */

import java.util.*;
public class WhileEx10 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int n=1; //메뉴
		String str="";
		
		while(n !=0) {
			System.out.print("1콜라, 2사이다, 3마운틴, 4초코송이, 5에이스, 6웨하스, 0:종료 : ");
			n = sc.nextInt();
			
			switch(n) {
			case 0:
				System.exit(0);
				break;
			case 1:
				str = "콜라";
				break;
			case 2:
				str = "사이다";
				break;
			case 3:
				str = "마운틴";
				break;
			case 4:
				str = "초코송이";
				break;
			case 5:
				str = "에이스";
				break;
			case 6:
				str = "웨하스";
				break;
				
				default : 
					str = "선택하신 상품이 없습니다.";
			}
			System.out.println("선택한 상품은 " +str+ "입니다.");
		} 
	}

}
