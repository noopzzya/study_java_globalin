package com.ioex;

import java.io.*;
public class FileEx04 {

	public static void main(String[] args) throws IOException{
		
		File f3 = new File("c:/aa/newFile.txt");
		
		if(f3.exists()) { // 파일 삭제
			f3.delete();
		}
	}

}
