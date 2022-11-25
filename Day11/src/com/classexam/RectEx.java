package com.classexam;

public class RectEx {

	public static void main(String[] args) {
		
		Rect r; // 객체선언(참조변수)
		r = new Rect(); // 객체생성
		//Rect r = new Rect(); 객체선언과 생성 한 번에 가능
		
		// 입력
		r.input(); //메소드 호출
		
		// area() 메소드 호출하고 결과를 리턴받아 area라는 변수에 저장한다.
		// 계산(연산처리)
		int  area = r.area();
		int length = r.length();

		// 출력 메소드 호출
		r.output(area, length);
				
		/*
		System.out.println("사각형의 넓이는 " +area+ "입니다.");
		System.out.println("사각형의 둘레는 " +length+ "입니다.");
		*/
	}

}
