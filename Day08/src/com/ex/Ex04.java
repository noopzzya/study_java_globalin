package com.ex;

import java.util.*;
public class Ex04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("exit를 입력하면 종료");
		while(true) {
			System.out.print(">>");
			String text = sc.nextLine(); // 한 라인 읽기, 공백단어 읽음
//			String text = sc.Line(); 공백단어 못 읽음
			if(text.equals("exit")) //exit가 입력되면 반복 종료
				break;
			
		}

	}

}
