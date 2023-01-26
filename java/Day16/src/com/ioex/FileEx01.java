package com.ioex;

import java.io.*;
public class FileEx01 {

	public static void main(String[] args) {
		
		File file = new File("C:\\aa/1208.txt");
		System.out.println("파일인지 여부:" +file.isFile());
		System.out.println("디렉토리인지 여부:" +file.isDirectory());
		
		System.out.println("경로:" +file.getPath());
		System.out.println("파일 이름:" +file.getName());
		System.out.println("파일 길이:" +file.length());
		System.out.println("파일의 최종 수정 날짜:" +file.lastModified()); // 초단위 출력	
	}

}
