package com.ex;

import java.util.Scanner;

/*문]
 * 과목과 점수가 짝을 이루도록 2개의 배열을 작성
 * 
 * 과목 이름을 입력받아 점수를 출력하는 프로그램을 작성하시오.
 * 종료를 "그만"을 입력하면 됨
 */

public class ArrayEx06 {

	public static void main(String[] args) {
		
		String[] subject = {"Java", "DataBase", "HTML5", "JSP", "Spring"};
		int[] score = {95, 88, 76, 62, 98};
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("과목명 입력:");
			String name = sc.next();
			if(name.equals("그만"))
				break;
			
			int i;
			for(i=0; i<score.length; i++) {
				if(subject[i].equals(name)) {
					System.out.println(name+"의 점수는 "+score[i]);
					break;
				}
			}
			if(i == score.length)
				System.out.println("과목명이 존재하지 않습니다. 다시 입력하세요.");
		}		
	}

}
