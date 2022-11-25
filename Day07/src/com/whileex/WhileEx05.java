package com.whileex;

public class WhileEx05 {

	public static void main(String[] args) {

		int i,j;
		
		i=2;
		while(i<=9) {
			j=1;
			while(j<=9) {
				System.out.printf("%3d x %3d = %3d\t", i, j, i*j);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
