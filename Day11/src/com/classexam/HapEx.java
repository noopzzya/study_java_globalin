package com.classexam;

import java.io.*;
public class HapEx {

	public static void main(String[] args) throws IOException{
		// 객체 생성
		Hap h = new Hap();
		
		// 입력 메소드 호출
		h.input();
		
		// 계산 메소드 호출
		int hap = h.calculate();
		
		// 출력 메소드 호출
		h.prt(hap);
		
	}

}
