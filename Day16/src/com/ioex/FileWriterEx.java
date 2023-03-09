package com.ioex;

import java.io.*;
public class FileWriterEx {

	public static void main(String[] args) {
		
		FileWriter writer = null;
		
		try {			
			writer = new FileWriter("c:/aa/fw.txt"); // 파일경로, 파일명 지정
			String str = "학교종이 깨졌다 엿을 사먹자!";
			writer.write(str); // 파일 객체에 쓰는 거
			/* 한 글자 단위로 읽고 쓸수 있는 Reader, Writer 계열의 스트림은
			 * 내부적으로 버퍼를 내장하고 있다
			 * 내장된 버퍼는 가득 채워질 때만 스트림을 통해서 내보낸다.
			 * 그런데, 버퍼가 채워지지 않았을 경우 flush()메소드를 이용해서
			 * 버퍼를 비울 수 있다.
			 */
			writer.flush(); // 버퍼 내보내면서 기록하고, 임시저장이니 비운다
		}catch (FileNotFoundException fe) {
			fe.printStackTrace();
		}catch (IOException ie) {
			ie.printStackTrace();
		}finally {
			try {
				if(writer != null) writer.close();
			}catch (IOException ii) {}		
		}
	}

}
