package com.ioex;

import java.io.*;
public class DataInputStreamEx {

	public static void main(String[] args) {
		
		DataInputStream dis = null; // 1차원 스트림
		// DataINputStream : 기본 자료형 타입 그대로 스트림을 통해서 읽어들임
			
		// 2차원 스트림
		FileInputStream fis = null; // 객체 선언
		
		try {
			
			// 객체 생성
			fis = new FileInputStream("c:/aa/data.sav");
			dis = new DataInputStream(fis);
			
			// 기본자료형
			// 읽어 들일 때는 반드시 저장한 순서대로 읽어야함
			int i = dis.readInt();
			double d = dis.readDouble();
			String s = dis.readUTF();
			
			// 콘솔창 출력
			System.out.println("i 값:" +i);
			System.out.println("d 값:" +d);
			System.out.println("s 값:" +s);
			
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
		}finally {
			try {
				if(fis !=null) fis.close();
			}catch (Exception e) {
			}
			
			try {
				if(dis !=null) dis.close();
			}catch (Exception e) {
			}			
		}
	}

}
