package com.objectex;

/*
 * 문]
 * 
 * 필드 : int 타입의 x , y, width, height 필드로 구성
 * x , y, width, height 매개변수로 받아 필드를 초기화는 생성자구성
 * 사각형의 넓이를 구하는 메소드 int square()
 * 사각형의 좌표와 넓이를 화면 출력하는 메소드 void show()
 * 매개변수로 받은 r이 현 사각형 안에 있으면 true를 리턴하는 메소드 boolean contains(Rectangle r)
 * 
 * Rectangle r = new Rectangle(2,2,8,7); // 기존
 * Rectangle s = new Rectangle(5,5,6,6);
 * Rectangle t = new Rectangle(1,1,10,10);
 * 
 *  t ==> r 포함
 *  t ==> s 포함
 * 
 *  출력
 *  (2,2)에서 크기가 8*7인 사각형
 *  s의 면적은 36
 *  t는 r을 포함합니다. 
 */

public class Rectangle {

	private int x , y, width, height;

	public Rectangle(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
	}
	
	 public int square() {
		 return width*height;
	 }
	
	 public void show() {
		 System.out.print("("+x+", "+y+")에서 ");
		 System.out.println("크기가 " +width+ "x" +height+ "인 사각형");
	 }
	 
	public boolean contains(Rectangle r) {
		if(x < r.x && y < r.y 
				&& x+width > r.x+r.width 
				&& y+height > r.y+r.height)
			return true;
		else
			return false;
	}
	
	public static void main(String[] args) {
		 Rectangle r = new Rectangle(2,2,8,7);
		 Rectangle s = new Rectangle(5,5,6,6);
		 Rectangle t = new Rectangle(1,1,10,10);
		 
		 r.show();
		 System.out.println("s의 면적은 " +s.square());
		 if(t.contains(r))System.out.println("t는 r을 포함합니다.");
		 if(t.contains(s))System.out.println("t는 s을 포함합니다.");
	}

}
