package exam;

/* 문]
 *     Scanner 클래스를 이용하여 정수로 된 돈의 액수를 입력받아 오만원권, 만원권, 오천원, 천원권,
 *     오백원짜리, 백원짜리, 오십원짜리, 십원짜리, 1원짜리 동전이 각각  몇개인지 변환하는
 *     프로그램을 작성하시오.
 *     
 *     출력형식
 *     
 *     금액을 입력하시오. >> 65376
 *     오만원권 1매
 *     만원권 1매
 *     천원권 3매     
 *     백원 3개
 *     오십원 1개
 *     십원 2개
 *     일원 6개
 */

import java.util.*;

public class Exam01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액을 입력하시오. >> ");
		int money = sc.nextInt();
		int oman =0, man=0, cheon=0, back=0, oship=0, ship=0, ill=0;
		int value1, value2, value3, value4, value5, value6=0,value7;
		if(money>=1) {
			oman = money/50000;
			value1= money - (50000* oman);
			man = value1/10000;
			value2 = value1 - (10000* man );
		    cheon= value2/1000;
		    value3 = value2 - (1000* cheon);
		    back = value3/100;
		    value4 = value3 - (100*back);
		    oship = value4/50;
		    value5 = value4 - (50*oship);
		    ship = value5/10;
		    value6 = value5 - (10*ship);
		    ill = value5 - value6 +value6; 
			}
		System.out.printf("5만원권 : %d매\n",oman);
		System.out.printf("1만원권 : %d매\n",man);
		System.out.printf("천원권 : %d매\n",cheon);
		System.out.printf("백원 : %d개\n",back);
		System.out.printf("오십원 : %d개\n",oship);
		System.out.printf("십원 : %d개\n",ship);
		System.out.printf("일원 : %d개\n",value6);
	}

}
