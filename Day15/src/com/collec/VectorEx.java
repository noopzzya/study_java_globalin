package com.collec;

import java.util.*;
public class VectorEx {

	private static final String colors[] = 
		{"검정", "노랑", "녹색", "청색", "빨강", "연두색"};
	
	public static void main(String[] args) {
		
		int i;
		String str;
		
		Vector<String> v = new Vector<>();
		for(i=0; i<colors.length; i++)
			v.add(colors[i]);
		
		/*
		// 전체 출력
		Iterator<String> it = v.iterator(); // 모든 컬렉션에는 iterator()메소드가 있다
		while(it.hasNext()) {
			String s = it.next();
			System.out.print(s+" ");
		}
		*/
		
		for(Object o : v) { // for문 형변환보다 Iterator 사용하는게 더 좋음
			String s = (String)o;
			System.out.print(s+ " ");
		}
	}
	
}
