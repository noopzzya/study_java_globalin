package com.dowhileex;

public class DowhileEx02 {

	public static void main(String[] args) {
		int i = 1;
		int sum = 0;
					
		do {
			sum += i;
			if(i<10) {
			System.out.print(i + " + ");
			} else {
					System.out.print(i + " = ");
					System.out.print(sum);
				}
				i++;
			} while (i <= 10);
				
	}

}
