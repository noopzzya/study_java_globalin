package com.collec;

import java.util.*;
public class VectorEx03 {

	public static void main(String[] args) {
		
		Vector<MyData> v = new Vector<>();
		
		v.add(new MyData("가길동", 50));
		v.add(new MyData("나길동", 60));
		v.add(new MyData("다길동", 70));

		for(MyData m : v)
			System.out.printf("이름:%s, 나이:%d%n", m.name, m.age);
	}

}
