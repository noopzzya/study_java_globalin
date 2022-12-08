package com.ioex;

import java.io.*;

import javax.swing.text.IconView;
public class FileCopyEx01 {

	public static void main(String[] args) {
		
		System.out.println("파일 복사 시작...");
		long start = System.currentTimeMillis(); // 시작시간
		//System.out.println((start/1000) / 60 / 60 / 60 / 60 / 60);
		
		FileInputStream src = null; // 원본
		FileOutputStream dest = null; // 복사본

		try {
			
			// 원본
			src = new FileInputStream(new File("c:/aa/newDirectory/dest2.txt"));
			
			// 복사본
			dest = new FileOutputStream(new File("c:/aa/newDirectory/de.txt"));
			
			// FileInputStream 을 통해 읽어들인 값을 저장 할 변수
			int readValue = 0;
			
			// FileInputStream의 read()메소드를 통해서 읽어들인 값을 readValue에 저장
			while((readValue = src.read()) != -1) { // src는 input, -1은 파일끝을 의미
				// readValue에 저장된 값을 FileOutputStream의 write()메소드를 통해서 파일에 기록
				dest.write(readValue); // output
			}
			
		}catch (FileNotFoundException fn) {
			fn.printStackTrace();
		}catch(IOException ii) {
			ii.printStackTrace();
		}finally {
			
			try {
				if(dest != null) dest.close();
			}catch(IOException ie) {}
			
			try {
				if(src != null) src.close();
			}catch(IOException ie) {}
		}
		
		long end = System.currentTimeMillis(); // 끝나는 시간
		
		long copyTime = (end -start)/1000;
		System.out.println("걸린시간:" +copyTime+ "초");
	
	}

}
