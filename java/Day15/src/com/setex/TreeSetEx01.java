package com.setex;

import java.util.*;
public class TreeSetEx01 {

	public static void main(String[] args) {
		
		Set set = new TreeSet();
		
		//for(int j=0; j<5; j++) { // 계단식
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(new Integer(num));
			//System.out.println(set);
		}
		System.out.println(set);
		//}
	}

}
