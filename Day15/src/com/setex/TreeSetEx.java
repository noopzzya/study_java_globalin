package com.setex;

import java.util.*;
public class TreeSetEx {

	public static void main(String[] args) {
		
		TreeSet<Integer> set = new TreeSet<>();
		
		// 시험점수 평점
		int[] score = {80, 95, 50, 35, 45, 65, 10, 100, 67, 55, 84, 96, 23};
		
		for(int i=0; i<score.length; i++) {
			set.add(score[i]);
		}
		
		System.out.println("50보다 작은 값은 " +set.headSet(new Integer(50)));

		System.out.println("50보다 큰 값은 " +set.tailSet(new Integer(50)));
	}

}
