package exam;

import java.util.*;

public class Exam01_1 {

	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		
		final int oman = 50000;
		final int man = 10000;
		final int ochonwon = 5000;
		final int chonwon = 1000;
		final int obakwon = 500;
		final int bakwon = 100;
		final int oshibwon = 50;
		final int shibwon = 10;
		final int owon = 5;
		final int ilwon = 1;
		
		System.out.print("금액을 입력하시오. >> ");
		
		int res = 0, money = sc.nextInt();
		res = money/oman; // 오만원권 개수
		money = money % oman; // money 계산
		if (res > 0) {
			System.out.println("오만원권 " + res + "매");
		}
		
		res = money/man; // 만원권 개수
		money = money % man; // money 계산
		if (res > 0) {
			System.out.println("만원권 " + res + "매");
		}
		
		res = money/ochonwon; // 오천원권 개수
		money = money % ochonwon; // money 계산
		if (res > 0) {
			System.out.println("오천원권 " + res + "매");
		}
		
		res = money/chonwon; // 천원권 개수
		money = money % chonwon; // money 계산
		if (res > 0) {
			System.out.println("천원권 " + res + "매");
		}
		
		res = money/obakwon; // 오백원권 개수
		money = money % obakwon; // money 계산
		if (res > 0) {
			System.out.println("오백원권 " + res + "매");
		}
		
		res = money/bakwon; // 백원권 개수
		money = money % bakwon; // money 계산
		if (res > 0) {
			System.out.println("백원권 " + res + "매");
		}
		
		res = money/oshibwon; // 오십원권 개수
		money = money % oshibwon; // money 계산
		if (res > 0) {
			System.out.println("오십원권 " + res + "매");
		}
		
		res = money/shibwon; // 십원권 개수
		money = money % shibwon; // money 계산
		if (res > 0) {
			System.out.println("십원권 " + res + "매");
		}
		
		res = money/owon; // 오원권 개수
		money = money % owon; // money 계산
		if (res > 0) {
			System.out.println("오원권 " + res + "매");
		}
		
		res = money/ilwon; // 일원권 개수
		money = money % ilwon; // money 계산
		if (res > 0) {
			System.out.println("일원권 " + res + "매");
		}
	}

}
