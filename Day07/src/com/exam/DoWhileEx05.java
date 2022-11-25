package com.exam;

public class DoWhileEx05 {

	public static void main(String[] args) {
		int i,j;
		
		i=5;
		do {
			 i--;			 
			 j=0;
			do{
				 j++;
				 System.out.print("*");
			}while(j<=i);
			System.out.println();
		}while(i>=1);

	}
	
}