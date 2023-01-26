package com.enumex;

public class LocalTest {

	static int a = 10; // 클래스변수
	int b = 20; // 인스턴스 변수
	// 둘다 전역변수, static이 없으면 객체 생성해야함

	public void write() {
		int c = 30;
		//c = 50; final(최종값) 지정해야함
		final int d = 40;
		
		class LocalNested{
			public void prt() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c); 
				System.out.println(d);
			}
		}
		
		LocalNested ln = new LocalNested();
		ln.prt();
		
	}
	
	public static void main(String[] args) {
		
		LocalTest lt = new LocalTest();
		lt.write();

	}

}
