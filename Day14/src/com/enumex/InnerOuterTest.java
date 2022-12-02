package com.enumex;

public class InnerOuterTest {

	static int a = 10;
	int b = 20;	
	class InnerNested{
		
		int c = 30;
		public void write() {
			
			System.out.println("a:"+a);
			System.out.println("b:"+b);
			System.out.println("c:"+c);			
		}
	}
	
	public static void main(String[] args) {
		
		// 외부 클래스의 객체를 먼저 생성한다
		InnerOuterTest iot = new InnerOuterTest(); // 바깥쪽
		
		// 외부클래스를 통해서 내부 클래스의 객체를 생성한다
		InnerOuterTest.InnerNested iin = iot.new InnerNested(); // 안쪽
		
		// iot.write(); 바깥쪽은 안쪽 볼 수 없음 > 안쪽을 감싸는 것 > 캡슐화
		iin.write();
	}
	
}
