package com.absex;

public class UserDraw {

	public static void main(String[] args) {
		
		Diagram[] di = new Diagram[3];
		
		//Diagram di = new Diagram();
		
		di[0] = new Triangle();
		di[1] = new Ractangle();
		di[2] = new Circle();
		
		for(int i=0; i<di.length; i++)
			di[i].draw();

	}

}
