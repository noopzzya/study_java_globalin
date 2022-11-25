package com.inher;

public class SonEx extends ParentEx{
	
	int foo = 7;

	public int getNumber(int a) {
		return a+2;
	}
	
	public static void main(String[] args) {
		ParentEx pe = new SonEx();
		
		System.out.println(pe.getNumber(0));
		// 다형성에서 메소드는 자식
		System.out.println(pe.foo);
		// 멤버필드는 부모것을 사용
	}	
}
