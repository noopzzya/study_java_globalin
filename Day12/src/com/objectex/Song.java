package com.objectex;

/* 문]
 * 
 * 필드 구성
 *  	제목:title, 가수:artist, 노래발표년도:year, 국적:country
 *  	
 *  	생성자 2개로 구성 : 기본생성자, 모든 필드를 초기화하는 생성자
 *		노래의 정보를 출력하는 메소드 : show()
 *		
 *		객체 생성하여 노래 정보를 출력하는 프로그램을 작성하시오.
 *
 *  	출력
 *  	1978년 스웨덴국적의 ABBA가 부른 Dancing Queen
 */

public class Song {
	
	private String title;
	private String artist;
	private int year;
	private String country;
	
	// 생성자 오버로딩 구현
	public Song() {} //생성자 오버로딩 시 new 연산자로 생성자 호출 시 매개값의 타입과 수로 호출 될 생성자 결정
	public Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	
	public void show() {
		System.out.print(year+"년 ");
		System.out.print(country+ "국적의 ");
		System.out.print(artist+ "가 부른 ");
		System.out.println(title);
	}
	
	public static void main(String[] args) {
		
		Song s= new Song("Dancing Queen", "ABBA", 1978, "스웨덴"); // 매개변수 순서 작성
		s.show();
	}	
}
