package com.gameex;

/*문6]
	Point클래스를 상속받아 색을 가진 점을 나타내는 Point3D 클래스를 작성하시오.

	main()	
	public static void main(String[] args{

	Point3D p = new Point3D(1,2,3); // 1,2,3은 각각 x,y,z 축의 값을 의미함
	System.out.println(p.toString()+ "입니다.");
	
	p.moveUp(); // z축 위로 이동
	System.out.println(p.toString()+ "입니다.");

	p.moveDown(); // z축 아래로 이동
	p.move(10, 10); // x,y축으로 이동
	System.out.println(p.toString()+ "입니다.");
	
	p.move(100, 200, 300);	
	System.out.println(p.toString()+ "입니다.");
	}

	출력
	(1,2,3)의 점입니다.
	(1,2,4)의 점입니다.
	(10,10,3)의 점입니다.
	(100,200,300)의 점입니다.
 */

public class Point3D extends Point{

	private int z;
	
	public Point3D(int x, int y, int z) {
		super(x, y);
		this.z = z;
	}
	
	public int getZ() {
		return z;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "(" + getX()+ ", " +getY()+ ", " +getZ()+ ")의 점";
	}
	
	public void move(int x, int y, int z) {
		// TODO Auto-generated method stub
		super.move(x, y);
		this.z = z;
	}
	
	public void moveUp() {
		z++;
	}
	
	public void moveDown() {
		z--;
		}

	public static void main(String[] args) {
		Point3D p = new Point3D(1,2,3); // 1,2,3은 각각 x,y,z 축의 값을 의미함
		System.out.println(p.toString()+ "입니다.");
		
		p.moveUp(); // z축 위로 이동
		System.out.println(p.toString()+ "입니다.");

		p.moveDown(); // z축 아래로 이동
		p.move(10, 10); // x,y축으로 이동
		System.out.println(p.toString()+ "입니다.");
		
		p.move(100, 200, 300);	
		System.out.println(p.toString()+ "입니다.");

	}



}
