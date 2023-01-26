package com.ioex;

/* DataInputStream과 DataOutputStream
 * 
 * 특정 데이터 타입과 포멧을 유지한 채 데이터를 기록하고 읽어올 수 있는 스트림
 * 특정 데이터 타입과 포멧을 맞게 읽고 쓸 수 있는 메소드를 제공
 * 		writeBoolean(boolean v), writeInt(int i), writeUTF(String s)
 * 		readInt(), readUTF(), readBoolean()
 */

import java.io.*;
public class DataOutputStreamEx {

	public static void main(String[] args) {
		
		DataOutputStream dos = null; // 1차원 스트림
		// DataOutputStream : 기본 자료형 타입 그대로 스트림을 통해서 저장 할 수 있다.
			
		// 2차원 스트림
		FileOutputStream fos = null; // 객체 선언
		
		try {
			
			// 객체 생성
			fos = new FileOutputStream("c:/aa/data.sav");
			dos = new DataOutputStream(fos);
			
			// 기본자료형
			int i = 10;
			double d = 3.14;
			String s = "Java가 최고야!!!!!";
			
			// 특정 데이터 타입으로 저장
			dos.writeInt(i);
			dos.writeDouble(d);
			dos.writeUTF(s);
			
		}catch(FileNotFoundException fe) {
			fe.printStackTrace();
		}catch(IOException ie) {
			ie.printStackTrace();
		}finally {
			try {
				if(fos !=null) fos.close();
			}catch (Exception e) {
			}
			
			try {
				if(dos !=null) dos.close();
			}catch (Exception e) {
			}			
		}
	}

}
