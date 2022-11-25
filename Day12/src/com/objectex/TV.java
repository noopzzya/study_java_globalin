package com.objectex;

/*
 * 문]
 * 		// 생성자로 초기화, 메소드를 이용하여 출력하는 프로그램을 작성
 *  	LG, 2017, 65인치
 *  
 *  	// 출력
 * 		LG에서 만든 2017년형 65인치 TV
 * 
 * 		manufacturer, year, size
 * 		show()
 * 
 */

public class TV {

	// 필드 정의
	private String manufacturer;
	private int year;
	private int size;		
	
	// 생성자 함수
	public TV(String manufacturer, int year, int size) {
		this.manufacturer = manufacturer;
		this.year = year;
		this.size = size;
	}
	
	// 메소드 정의
	public void show() {
		System.out.print(year+"년형 ");
		System.out.print(size+"인치 TV ");
	}
	
	public static void main(String[] args) {
		
		TV tv = new TV("LG", 2017, 64); //new TV 확인해야함!
		tv.show();	
	}
}
