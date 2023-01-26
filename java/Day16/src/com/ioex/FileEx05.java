package com.ioex;

import java.io.*;
public class FileEx05 {

	public static void main(String[] args) throws IOException{

		File src = new File("c:/aa/1208.txt");
		
		File dest = new File("c:/aa/newDirectory/dest.txt");
		
		File dest2 = new File("c:/aa/newDirectory/dest2.txt");
		
		if(dest.exists()) {
			//src.renameTo(dest); // if(src.exists()) 로 해야함
			dest.renameTo(dest2);
		}
	}

}
