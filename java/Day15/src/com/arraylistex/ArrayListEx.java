package com.arraylistex;

import java.util.*;
public class ArrayListEx {

	public static void main(String[] args) {
		
		List<String> list1 = new ArrayList<>();
		list1.add("공각기동대"); // 0번째
		list1.add("원령공주");		
		
		List<String> list2 = new ArrayList<>(list1);
		list2.add("라퓨타");
		
		List<String> list3 = new ArrayList<>();
		list3.addAll(list2);
		
		int n = list3.indexOf("원령공주"); // 1
		//System.out.println(n);
		list3.add(n+1, "코난"); // 2 [0 1 2]
		System.out.println(list3);
		
		ListIterator<String> it = list3.listIterator(); // 형변환 필요
		while(it.hasNext()) {
		System.out.print(it.next()+ " ");
		}
	}

}
