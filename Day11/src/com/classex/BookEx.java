package com.classex;

public class BookEx {
	
	public void Book() { // 인스턴스 메소드
		
		Book myBook;
		
		// 객체 선언
		myBook = new Book();
		
		// 객체 생성
		myBook.name = "자바의 정석";
		// Book myBook = new Book(); -> 객체선언과 객체생성 한 줄로 가능
		
		myBook.price = 500;
		System.out.println("책 제목은 " +myBook.name+ "이고, 책 가격은 " +myBook.price);
		
	}

	public static void main(String[] args) {
		
		// 객체 생성
		BookEx be = new BookEx();
		
		// 인스턴스 메소드 호출
		be.Book();

	}
}
