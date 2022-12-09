package com.ioex;

import java.io.*;
// 역직렬화해서 파일로 읽어옴
public class ObjectInputStreamEx {

	public static void main(String[] args){
		
		ObjectInputStream ois = null;
		
		try {
			
			ois = new ObjectInputStream(new FileInputStream("c:/aa/obj.sav"));
			
			Data data = (Data)ois.readObject();
			
			System.out.println("번호:" +data.getNo());
			System.out.println("이름:" +data.getName());
			System.out.println("메일:" +data.getMail());
			
		}catch(ClassNotFoundException cefn) {
			cefn.printStackTrace();
		}catch(FileNotFoundException fefn) {
			fefn.printStackTrace();
		}catch(IOException ii) {
			ii.printStackTrace();
		}finally {
			try {
				if(ois != null) ois.close();
			}catch(IOException ie) {
				ie.printStackTrace();
			}
		}

	}

}
