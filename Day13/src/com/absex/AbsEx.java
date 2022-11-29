package com.absex;

public class AbsEx extends AbsEx2{

	public static void main(String[] args) {
		AbsEx ae = new AbsEx();
		
		System.out.println(ae.getA());
		System.out.println(ae.getStr());
	}

	@Override
	public String getStr() { // AbsEx2의 추상 메소드 재정의
		return str; // 멤버변수는 AbsEx1
	}
}
