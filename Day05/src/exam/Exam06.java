package exam;

/* 문] 
 *     369 게임프로그램을 작성하시오.
 *     1 ~ 99까지의 정수를 입력받고 3, 6, 9 중 하나가 있을 경우 "박수짝"을 출력하고,
 *     두개가 있는 경우는 "박수짝짝"을 출력하는 프로그램을 작성하시오.
 *     단, 정수가 1 이하이거나 99이상일 경우 "숫자가 범위를 벗어났습니다."를 출력
 *     
 *     ex) 13인 경우 "박수짝"을, 36인 경우 "박수짝짝"을 출력함
 *     
 *     출력형식
 *     1 ~ 99 사이의 정수를 입력하시오. >> 36
 *     박수짝짝
 * 
 */

import java.util.*;

public class Exam06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int game;
		System.out.print("1 ~ 99 사이의 정수를 입력하시오. >> ");
		game = sc.nextInt();
		
		if(game>=1 && game <= 99) {
			if(game<=9) {
				if(game%3==0) {System.out.println("박수짝");}
			}else if(game<=19) {
				if (game%3==1) {System.out.println("박수짝");}
			}if(game<=29) {
				if(game%3==2) {System.out.println("박수짝");}
			}else if(game==30) {System.out.println("박수짝");
			}else if(game<=39) {
				if(game%3==0) {
					System.out.println("박수짝짝");
				}else {System.out.println("박수짝");}
			}else if(game==40) {
			}if(game<=49) {
				if(game%3==1) {System.out.println("박수짝");}
			}else if(game==50) {
			}else if(game<=59) {
				if(game%3==2) {System.out.println("박수짝짝");}
				else if(game==60) {System.out.println("박수짝");}
			}else if(game<=69) {
				if(game%3==0) {
					System.out.println("박수짝짝");
				}else {System.out.println("박수짝");}
			}else if(game==70) {
			}if(game<=79) {
				if(game%3==1) {System.out.println("박수짝");}
			}else if(game==80) {
			}else if(game<=89) {
				if(game%3==2) {System.out.println("박수짝짝");}
			}else if(game==90) {System.out.println("박수짝");}
			else if(game<=99) {
				if(game%3==0) {
					System.out.println("박수짝짝");
				}else {System.out.println("박수짝");}
			}
			else {
			System.out.println("숫자가 범위를 벗어났습니다.");
		}
	}
	}
}

