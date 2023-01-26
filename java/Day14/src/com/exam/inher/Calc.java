package com.exam.inher;

public abstract class Calc { // 추상 클래스

	protected int a, b;
	
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	public abstract int calculate();
	
}
