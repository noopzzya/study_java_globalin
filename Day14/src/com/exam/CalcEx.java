package com.exam;

import java.util.*;
public class CalcEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("두 정수와 연산자 입력:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		char operator = sc.next().charAt(0);
		
		switch (operator) {
		case '+': 
			Add  add= new Add();
			add.setValue(a, b);
			System.out.println(add.calculate());
			break;
			        
		case '-':
			Sub sub = new Sub();
			sub.setValue(a, b);
			System.out.println(sub.calculate());			
			break;
			
		case '*':
			Mul mul = new Mul();
			mul.setValue(a, b);
			System.out.println(mul.calculate());
			break;
			
		case '/':
			Div div = new Div();
			div.setValue(a, b);
			System.out.println(div.calculate());
			break;
			
		default:
			System.out.println("잘못된 연산자 입니다.");
			break;
		}
	}

}
