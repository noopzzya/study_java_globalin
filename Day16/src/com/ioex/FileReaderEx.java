package com.ioex;

import java.io.*;
public class FileReaderEx {

	public static void main(String[] args) {
		FileReader reader= null;
		
		try {			
			
			// 파일로 부터 한 문자 단위로 읽어온다
			reader = new FileReader("c:/aa/fw.txt");
			
			// 스트림을 통해서 읽어들인 유니코드 값을 저장 할 변수를 선언
			int readValue = 0;
			
			while((readValue = reader.read()) != -1) {
				System.out.print((char)readValue);
			}
			
		}catch (FileNotFoundException fe) {
			fe.printStackTrace();
		}catch (IOException ie) {
			ie.printStackTrace();
		}finally {
			try {
				if(reader != null) reader.close();
			}catch (IOException ii) {}			
		}
	}

}
