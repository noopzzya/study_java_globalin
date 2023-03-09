package com.ioex;

import java.io.*;
public class FileInputStreamEx {

	public static void main(String[] args) { // throws IOException, FileNotFoundException
		
		FileInputStream fis = null;
		
		byte _read[] = new byte[100];
		byte console[] = new byte[100]; // 여기서 공백있을 수 있어 아래에서 trim사용
		
		try {
			
			System.out.print("파일명:");
			System.in.read(console);
			String file = new String(console).trim(); // trim:공백제거, 순수text만 읽음
			
			fis = new FileInputStream(file);
			fis.read(_read, 0, _read.length);
			System.out.println(new String(_read).trim());			
			
		}catch(FileNotFoundException fn) {
			fn.printStackTrace();
		}catch(IOException ii) {
			ii.printStackTrace();
		}finally {
			try {
				if(fis != null)
				fis.close();
			}catch(IOException eee) {
				eee.printStackTrace();
			}
		}

	}

}
