package com.collec;

import java.util.Stack;
public class StackEx {

	private static final String colors[] = 
		{"검정", "노랑", "녹색", "청색", "빨강", "연두색"};
	
	public StackEx() {
	// 스택 객체 생성 (특정한 자료형만 들어가게 생성, 여기서는 String만 들어가게)
		Stack<String> st  = new Stack<>(); // api로 앞에 선언해서 <>안에 생략가능
		
		for(String color : colors) // String 배열
			st.push(color);
		popStack(st); // 메소드 호출해야 출력가능
	}
	
	public void popStack(Stack<String> st) { // 스택  객체를 매개변수로 넣음
		System.out.println("pop");
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
	}

	public static void main(String[] args) {
	
		new StackEx();
	}

}
