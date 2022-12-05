package com.collec;

import java.util.*;
public class VectorEx02 {

	private static final String colors[] = 
		{"검정", "노랑", "녹색", "청색", "빨강", "연두색","검정", "노랑", "녹색", "청색", "갈색"};
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		System.out.println("벡터의 크기:" +v.capacity()); // 벡터의 크기는 2배로 증가
		
		for(String str : colors)
			v.add(str);
		
		System.out.println("요소의 개수:" +v.size());
		
		System.out.println("첫번째 인덱스 값:" +v.firstElement());
		System.out.println("두번째 인덱스 값:" +v.get(1));
		System.out.println("마지막 인덱스 값:" +v.lastElement());
		
		// 두번째 값을 핑크색상으로 변경
		v.set(1, "분홍색");
		System.out.println("두번째 인덱스 값:" +v.get(1));
		System.out.println("요소의 개수:" +v.size());
		
		v.remove(1);
		System.out.println("요소의 개수:" +v.size());
		System.out.println("벡터의 크기:" +v.capacity());
		
		// 전체 출력
		for(String str : v) {
			System.out.print(str+ " ");
		}

	}

}
