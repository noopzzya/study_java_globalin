package com.classexam;

public class JavaPizza {

	public static void main(String[] args) {
		
		// 객체선언과 생성
		Circle pizza = new Circle();
		Circle donut = new Circle();
		
		/*
		pizza.radius = 7;
		pizza.name = "자바피자";
		*/
//		double pizzasize = pizza.getArea();
//		
//		System.out.println("크기가 "+pizzasize+ "인 " +pizza.name +"입니다.");
		System.out.println(pizza.radius);
		System.out.println(pizza.name);
		System.out.println("맛있게 드세요.");
	}
}
