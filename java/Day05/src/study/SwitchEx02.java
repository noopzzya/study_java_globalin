package study;

/* 문]
 *      switch case 문을 이용하여 커피 메뉴의 가격을 알려주는 프로그램을 작성하시오.
 *      에스프레소, 카푸치노, 카페라떼는 3,500원이고
 *      아메리카노는 2000원임
 *      
 *      출력형식
 *      무슨 커피를 드릴까요? 에스프레소
 *      에스프레소는 3500원입니다.
 */

import java.util.*;

public class SwitchEx02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("무슨 커피를 드릴까요? ");
		String order = sc.nextLine();
		
		int price = 0;
		
		switch (order) {
		    case "에스프레소":
		    case "카푸치노":
		    case "카페라떼":
		    	price = 3500;
		    	break;
		    case "아메리카노":
		    	price = 2000;
		    	break;
		    default:
		    	System.out.println("없는 메뉴입니다. 메뉴를 확인해주세요.");
		    		
		}
		if(price !=0) {
			System.out.println(order + "는 " + price + "입니다.");
		}
		

	}

}
