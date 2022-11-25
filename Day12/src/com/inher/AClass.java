package com.inher;

public class AClass {
	
	protected int  x, y;
	protected char ch;
	
	public AClass() { } // 기본 생성자
	
	public void write(double result) {
		System.out.printf("%d %c %d = %.2f\n", x, ch, y, result);
	}
}
