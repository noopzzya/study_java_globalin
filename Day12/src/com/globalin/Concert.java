package com.globalin;

import java.util.*;
public class Concert {

	private String hallName;
	private Group[] group = new Group[3];
	private Scanner sc = new Scanner(System.in);
	
	public Concert(String hallName) {
		this.hallName = hallName;
		group[0] = new Group('S', 10);
		group[1] = new Group('A', 10);
		group[2] = new Group('B', 10);
	}
	
	// 콘서트 예약
	private void reserve() {
		System.out.print("좌석구분 S(1), A(2), B(3) => ");
		int type = sc.nextInt();
		
		if(type<1 || type>3) {
			System.out.println("타입이 존재하지 않습니다.");
			return;
		}
		group[type-1].reserve();
	}
	
	// 콘서트 예약 검색
	private void search() {
		for(int i=0; i<group.length; i++)
			group[i].show();
		System.out.println(">>>> 조회를 완료 하였습니다. <<<<");		
	}
	
	// 콘서트 예약 취소 (예약동일)
	private void cancel() {
		System.out.print("좌석구분 S(1), A(2), B(3) => ");
		int type = sc.nextInt();
		
		if(type<1 || type>3) {
			System.out.println("타입이 존재하지 않습니다.");
			return;
		}
		group[type-1].cancel();
	}
	
	// 콘서트 예약/취소/검색을 실행함
	public void run() {
		System.out.println(hallName+ "예약 프로그램입니다.");
		
		int choice = 0;
		while(choice !=4) {
			System.out.print("예약:1, 조회:2, 취소:3, 종료:4 =>");
			choice = sc.nextInt();
			
			switch(choice) {
			case 1: // 예약
				reserve();
				break;
			case 2: // 조회
				search();
				break;
			case 3: // 취소
				cancel();
				break;
			case 4: // 종료
				break;
			default :
				System.out.println("잘못 입력 하셨습니다.");
			}
		}
		
	}
	
}
