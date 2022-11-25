package com.globalin;

import java.util.*;
public class Group {

	private char type; // S, A, B
	private Seat[] seats; // 현재 등급의 좌석 객체 배열
	private Scanner sc = new Scanner(System.in);
	
	public Group(char type, int num) { // 생성자
		this.type = type;
		seats  = new Seat[num];
		
		for(int i=0; i<seats.length; i++)
			seats[i] = new Seat();
	}
	
	// 좌석 예약
	public boolean reserve() {
		int no;
		String name;
		show();
		System.out.print("이름:");
		name = sc.next();
		System.out.print("번호:");
		no = sc.nextInt();
		
		if(no < 1 || no >= seats.length) {
			System.out.println("잘못된 좌석 번호 입니다.");
			return false;
		}
		if(seats[no-1].isOccupied()) { // 이미 에약된 좌석번호가 있다면
			System.out.println("이미 예약된 좌석번호 입니다.");
			return false;
		}
		seats[no-1].reserve(name);
		
		return true; // 예약 성공
	}
	
	// 좌석 예약 취소
	public boolean cancel() {
		show();
		System.out.print("이름:"); // 취소 할 사람의 이름
		String name = sc.next();
		
		if(name != null) {
			for(int i=0; i<seats.length; i++) {
				if(seats[i].math(name)) { // 예약된 사람의 일치한다면
					seats[i].cancel(); // 취소
					return true; // 예약취소 성공
				}
			}
			System.out.println("예약된 사람을 찾을 수 없습니다.");
		}
		return false; // 예약자의 이름을 찾지 못했을 경우 false 반환
	}
	
	// 좌석 출력
	public void show() {
		System.out.print(type+ ">>");
		for(int i=0; i<seats.length; i++) {
			
			if(seats[i].isOccupied()) {
				System.out.print(seats[i].getName());
			}else {
				System.out.print("---");
			}
			System.out.print(" ");
		}
		System.out.println();
	}
	
}
