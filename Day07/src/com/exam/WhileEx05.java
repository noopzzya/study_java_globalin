package com.exam;

public class WhileEx05 {

	public static void main(String[] args) {
		int i,j;
			
		i=6;
		while(i>=1) {
			 i--;			 
			 j=1;
			while(j<=i) {
				 j++;
				System.out.print("*");
			}System.out.println();
		}

	}

}
