package com.classexam;

import java.io.*;
public class CalcEx {

	public static void main(String[] args) throws IOException{
		
		Calc c = new Calc();
		// 입력기능
		c.input();
		
		// 연산처리기능
		int sum = c.cal();
		
		// 출력기능구현
		c.prt(sum);
	}
}
