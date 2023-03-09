package com.ioex;

import java.io.*;
public class FileEx02 {

	public static void main(String[] args) {
		
		File dir = new File("c:/");
		
		if(dir.exists()) {
			if(dir.isDirectory()) {
				String[] fileList = dir.list();
				
				for(String fileName : fileList) {
					System.out.println("파일 이름:" +fileName);
				}			
			}
		}

	}

}
