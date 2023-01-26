package com.setex;

import java.util.*;
public class HashSetEx {

	public static void main(String[] args) {
		
		Set<String> dog = new HashSet<String>();
		
		dog.add("진돗개");
		dog.add("풍산개");
		dog.add("삽살이");
		
		System.out.println(dog);
		
		dog.add("진돗개");
		
		System.out.println(dog); // 중복 허용 안함. 추가안됨. 오류아님
		System.out.println();
		Iterator<String> it = dog.iterator();
		
		while(it.hasNext()) { // 데이터 있으면
			String s = it.next();
			System.out.print(s+ " ");
		}	
	}

}
