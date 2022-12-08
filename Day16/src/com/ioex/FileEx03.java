package com.ioex;

import java.io.*;
public class FileEx03 {

	public static void main(String[] args) {// try catch 대신 "throws IOException"도 가능
		
		// 파일 생성
		File f1 = new File("c:/aa/newFile.txt"); // 빈 파일 만듬
		
		if(f1.exists()) {
			System.out.println("파일 이름:" +f1.getName());
		}else {
			
			try {
				if(f1.createNewFile()) {
					System.out.println("새로운 파일을 만들었습니다.");				
				}
			}catch(IOException ii) { 
				ii.printStackTrace();
			}
		}
		
		// 디렉토리 생성
		File f2 = new File("c:/aa/newDirectory");
		
		if(!f2.exists()) { // 존재하지 않으면
			f2.mkdir(); // 생성
		}else {
			System.out.println("디렉토리 이름:" +f2.getPath());
		}
	}

}
