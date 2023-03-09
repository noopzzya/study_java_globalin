package com.collec;

import java.util.*;
class MyVector extends Vector{
	
	public MyVector() {
		super(1,1);
	}
	
	public void addInt(int i) {
		addElement(new Integer(i)); // 객체로 만들기위해
	}
	
	public void addFloat(float f) {
		addElement(new Float(f));
	}
	
	public void addString(String s) { // String은 이미 객체
		addElement(s);
	}
	
	public void addCharArray(char[] a) { // char는 배열이라 가능
		addElement(a);
	}
	
	public void write() {
		Object o;
		int length = size();
		
		for(int i=0; i<length; i++) {
			o = elementAt(i);
			if(o instanceof char[]) {
				System.out.println(String.copyValueOf((char[])o));
			}else
			System.out.println(o.toString());
		}
	}
	
}

public class VectorEx01 {

	public static void main(String[] args) {
		
		MyVector mv = new MyVector();
		
		int d = 5;
		float r = 3.14f;
		char[] letters = {'J', 'V', 'B', 'A'};
		String s = new String ("Hello Java");
		//String s[] = {"Hello Java"};
		
		mv.addInt(d);
		mv.addFloat(r);
		mv.addCharArray(letters);
		mv.addString(s);
		
		mv.write();
	}

}
