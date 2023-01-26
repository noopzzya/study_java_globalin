package com.circleex;

import java.util.*;
public class CircleManager {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Circle[] c = new Circle[3]; // 객체 배열을 선언
		
		// 입력
		for(int i=0; i<c.length; i++) {
			System.out.print("x, y, radius:");
			double x = sc.nextDouble();
			double y = sc.nextDouble();
			int radius = sc.nextInt();
			c[i] = new Circle(x, y, radius); // 객체 배열 생성
		}
		
		int Max = 0;
		for(int i=1; i<c.length; i++) {
			if(c[Max].getArea() < c[i].getArea())
				Max = i;
		}

		//출력
		for(int i=0; i<c.length; i++)
			c[i].show(); // 모든 Circle 객체 출력	
		
		System.out.print("가장 면적이 큰 원은 ");
		c[Max].show();
	}
	// 가장 면적이 큰 원은 : (2.5, 2.7)6	
}
