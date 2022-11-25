package com.inher;

public class CircleEx extends PointEx{
	
	private int r;
	
	public CircleEx() {}
	
	public CircleEx(int x) {
		super(x); // 부모의 생성자
		r =1;	
	}
	public CircleEx(int x, int y) {
		super(x, y); // 부모의 생성자
		r =2;
	}
	public CircleEx(int x, int y, int r) {
		super(x, y); // 부모의 생성자
		this.r = r;
	}
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	
	public void disp() {
		super.disp();
		System.out.println("r의 값:" +r);
	}
	
	public static void main(String[] args) {
		
//		CircleEx ce = new CircleEx();
//		CircleEx ce = new CircleEx(1);
//		CircleEx ce = new CircleEx(1,2);
		CircleEx ce = new CircleEx(1,2,3);
		ce.disp();
	}

}
