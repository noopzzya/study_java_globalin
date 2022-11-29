package com.gameex;

/* 문5]

	Point클래스를 상속받아 색을 가진 점을 나타내는 ColorPoint 클래스를 작성하시오.

	main()	
	public static void main(String[] args{

		ColorPoint zoroPoint = new ColorPoint(); // 0, 0 위치의 "BLACK"색 점
		System.out.println(zoroPoint.toString()+ "입니다.");
		
		ColorPoint cp = new ColorPoint(10, 10); // 10, 10 위치의 BLACK 색점
		cp.setXY(5, 5);
		cp.setColor("RED");
		
		System.out.println(cp.toString()+ "입니다.");
	}

	출력
	RED색의 (5, 5)의 점입니다.
	BLACK색의 (0, 0)의 점입니다.
 */

public class ColorPoint extends Point{

	private String color;
	
	public ColorPoint() {
		this(0,0);
	}
	
	public ColorPoint(int x, int y) {
		super(x, y);
		this.color = "BLACK";
	}

	public ColorPoint(int x, int y, String color) {
		super(x, y);
		this.color = color;
	}
	
	public void setXY(int x, int y) {
		move(x, y);
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return color+ "색의(" +getX()+ ", " +getY()+ ")의 점";
	}
	
	public static void main(String[] args) {
		
		ColorPoint zoroPoint = new ColorPoint(); // 0, 0 위치의 "BLACK"색 점
		System.out.println(zoroPoint.toString()+ "입니다.");
		
		ColorPoint cp = new ColorPoint(10, 10); // 10, 10 위치의 BLACK 색점
		cp.setXY(5, 5);
		cp.setColor("RED");
		
		System.out.println(cp.toString()+ "입니다.");
	}


}
