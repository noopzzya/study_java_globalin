package com.inher;

public class PointEx {
	
	private int x;
	private int y;
	
	public PointEx() {} // 기본생성자	
	public PointEx(int x) {
		this.x = x;
	}
	public PointEx(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public void disp() {
		System.out.println("x값:" +x);
		System.out.println("y값:" +y);
	}
	
}
