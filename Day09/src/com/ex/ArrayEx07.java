package com.ex;

import java.util.*;
public class ArrayEx07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 문자열 배열선언 (가위, 바위, 보)
		String[] com = {"가위", "바위", "보"};
		
		//안내멘트
		System.out.println("컴퓨터와 사용자 간의 가위바위보 게임을 시작합니다.");
		
		// 무한루프
		while(true) {
			System.out.print("가위 바위 보 : ");
			
			// 문자열 입력받음
			String a = sc.nextLine();
			if(a.equals("그만")) {
				System.out.print("게임을 종료합니다.");
				break; // whlie 문을 벗어남(종료)
			}
			int n = (int)(Math.random()*3); // 0 1 2 중에서 랜덤으로 정수값을 받음
			String b = com[n];
			
			System.out.print("사용자:" +a+ ", 컴퓨터:" +b+ ", ");
			//System.out.println();
			
			if(a.equals("가위")) { // 사용자가 가위인 경우
				if(b.equals("가위"))
					System.out.println("비겼습니다.");
				else if(b.equals("바위"))
					System.out.println("컴퓨터가 이겼습니다.");
				else // 보
					System.out.println("사용자가 이겼습니다.");
				
			}else if(a.equals("바위")) { // 사용자가 바위인 경우
				if(b.equals("가위"))
					System.out.println("사용자가 이겼습니다..");
				else if(b.equals("바위"))
					System.out.println("비겼습니다.");
				else // 보
					System.out.println("컴퓨터가 이겼습니다.");
				
			}else if(a.equals("보")) { //사용자가 보 경우
				if(b.equals("가위"))
					System.out.println("컴퓨터가 이겼습니다..");
				else if(b.equals("바위"))
					System.out.println("사용자가 이겼습니다.");
				else // 보
					System.out.println("비겼습니다.");
				
			}else { // 그 외 문자인 경우
				System.out.println("다시 하세요");
			}
	
		}
		
	}

}
