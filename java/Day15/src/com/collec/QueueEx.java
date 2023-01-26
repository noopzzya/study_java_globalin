package com.collec;

import java.util.LinkedList;
import java.util.Queue;

public class QueueEx {

	private static final String colors[] = 
		{"검정", "노랑", "녹색", "청색", "빨강", "연두색"};
	
	public static void main(String[] args) {
	
		Queue<String> qu = new LinkedList<>();
		
		for(String str : colors) {
			qu.offer(str); // offer : 추가된 요소(데이터)가 마지막 요소에 추가
		}
		
		while(qu.peek() !=null) { // peek : 가장 첫번째 요소를 반환(삭제)
			System.out.println(qu.poll());
		}
	}

}
