package com.arraylistex;

import java.util.*;
public class LinkedListEx {

	private static final String color1[]=
		{"검정", "노랑", "녹색", "파랑", "주황색", "연두색"};
	private static final String color2[]=
		{"초록", "빨강", "흰색", "남색", "보라"};
	
	public LinkedListEx() { // 생성자
	
		LinkedList<String> list1 = new LinkedList<>();
		List<String> list2 = new LinkedList<>();
		
		for(String color : color1)
			list1.add(color);
		for(String color : color2)
			list2.add(color);
		
		list1.addAll(list2);	
		printList(list1);
	}	
		
	// 출력
	public void printList(List<String> list) {
		System.out.println("\n list...");
		
		for(String color : list)
			System.out.printf("%s", color);
		
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		new LinkedListEx();

	}

}
