package com.gameex;

import java.util.*;
public class StackApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("총 스택 저장 공간의 크기를 입력:");
		int n = sc.nextInt();
		
		StringStack ss = new StringStack(n);
		// n개의 문자열이 저장가능한 스택 생성
		
		while(true) {
			System.out.print("문자열 입력:");
			String str = sc.next();
			if(str.equals("그만"))
				break;
			
			// 입력받은 문자열을 스택에 저장한다.
			boolean res = ss.push(str); // 스택에 저장 성공하면 true 리턴
			
			if(res == false) { // 스택에 저장이 안 될 경우 false 리턴
				System.out.println("스택이 꽉차서 못들어감");
			}
		}
		
		// 출력
		System.out.print("스택에 저장된 문자열 팝:");
		int len = ss.length(); // 현재 스택에 저장된 개수를 의미
		for(int i=0; i<len; i++) { // 스택에 저장된 개수만큼 반복실행
			System.out.print(ss.pop() +" "); // 스택에서 팝메소드 호출하여 출력
		}
	}

}
