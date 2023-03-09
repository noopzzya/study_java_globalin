package com.mapex;

import java.util.*;
public class HashMapEx03 {

	public static void main(String[] args) {
		
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		
		/*
		map.put("가찬수",  new Integer(90));
		map.put("다찬수",  new Integer(100));
		map.put("다찬수",  new Integer(100));
		map.put("마찬수",  new Integer(90));
		map.put("나수홍",  new Integer(80));
		*/
		map.put("가찬수",  90);
		map.put("다찬수",  100);
		map.put("다찬수",  100);
		map.put("마찬수",  90);
		map.put("나수홍",  0);
		
		Set set = map.entrySet();
		
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			Map.Entry e = (Map.Entry)it.next();
			System.out.println("이름:" +e.getKey()+ ", 점수" +e.getValue());			
		}
		
		set = map.keySet();
		System.out.println("이름:" +set);
		map.values(); // 객체
		
		Collection values = map.values();
		it = values.iterator();
		
		int sum = 0;
		while(it.hasNext()) {
			Integer i = (Integer)it.next();
			//System.out.println("점수:" +i); // 각 점수
			sum += i;
		}
		System.out.println("총점:" +sum);
		System.out.println("평균:" +(float)sum/set.size());
		
		System.out.println("최고점수:" +Collections.max(values));
		System.out.println("최저점수:" +Collections.min(values));
	}

}
