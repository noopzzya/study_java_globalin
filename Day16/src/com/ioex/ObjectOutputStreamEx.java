package com.ioex;

import java.io.*;

// 직렬화해서 파일로 저장
public class ObjectOutputStreamEx {

	public static void main(String[] args) {
		
		ObjectOutputStream oos = null;
		
		try {
			
			oos = new ObjectOutputStream(new FileOutputStream("c:/aa/obj.sav"));
			
			Data data = new Data();
			data.setNo(7);
			data.setName("손흥민");
			data.setMail("son@naver.com");
			
			oos.writeObject(data);
			
		}catch(FileNotFoundException fefn) {
			fefn.printStackTrace();
		}catch(IOException ii) {
			ii.printStackTrace();
		}finally {
			try {
				if(oos != null) oos.close();
			}catch(IOException ie) {
				ie.printStackTrace();
			}
		}
	}

}
