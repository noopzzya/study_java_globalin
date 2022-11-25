package com.dowhileex;

public class DoWhileEx04 {

	public static void main(String[] args) {
		int i,j;
		
		i=2;
		do {
			j=1;
			do {
				System.out.printf("%3d x %3d = %3d\t", i, j, i*j);
				j++;
			}while(j<=9);
			System.out.println();
			i++;
		}while(i<=9);

	}

}
