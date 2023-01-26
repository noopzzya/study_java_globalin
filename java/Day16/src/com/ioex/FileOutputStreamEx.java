package com.ioex;

import java.io.*;
public class FileOutputStreamEx {

	public static void main(String[] args) { // FileInputStreamEx 수정, input부분 주석처리
		
			FileOutputStream fos = null;
		
//		byte _read[] = new byte[100];
//		byte console[] = new byte[100];
		
		try {
			
//			System.out.print("파일명:");
//			System.in.read(console);
//			String file = new String(console).trim(); // trim:공백제거, 순수text만 읽음
			
			fos = new FileOutputStream("c:\\aa\\newDirectory\\dest2.txt"); // 파일경로
//			fos.read(_read, 0, _read.length);
//			System.out.println(new String(_read).trim());
			
			String message = "자바야 놀자!!!";
			fos.write(message.getBytes());
			fos.close();					
			
		}catch(FileNotFoundException fn) {
			fn.printStackTrace();
		}catch(IOException ii) {
			ii.printStackTrace();
		}finally {
			try {
				if(fos != null)
				fos.close();
			}catch(IOException eee) {
				eee.printStackTrace();
			}
		}

	}

}
