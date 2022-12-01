package com.exam.inher;

import java.util.*;
public class CalcMain {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자 입력:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char operator = sc.next().charAt(0);
		
		Calc exp = null; // 추상클래스 객체 선언 (추상클래스라 객체 생성 불가)
		
		switch (operator) {
		case '+': exp = new Add(); break;			
		case '-':	 exp = new Sub(); break;			
		case '*': exp = new Mul(); break;			
		case '/':	 exp = new Div(); break;			
		default:
			System.out.println("잘못된 연산자 입니다.");
			break;
		}
		exp.setValue(a, b);
		if(exp instanceof Div && b == 0)
			System.out.println("계산 할 수 없습니다.");
		else
			System.out.println(exp.calculate());
	}

}
