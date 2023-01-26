package com.ioex;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyEx02 {

	public static void main(String[] args) {
		System.out.println("파일 복사 시작...");
		long start = System.currentTimeMillis(); // 시작시간
		//System.out.println((start/1000) / 60 / 60 / 60 / 60 / 60);
		
		FileInputStream src = null; // 원본
		FileOutputStream dest = null; // 복사본

		try {
			
			// 원본
			src = new FileInputStream(new File("c:/aa/newDirectory/aa.txt"));
			
			// 복사본
			dest = new FileOutputStream(new File("c:/aa/newDirectory/bb.txt"));
			
			// 임시 저장소에 저장 된 데이터의 전체 개수를 저장 할 변수를 선언
			int length = 0;
			
			// 임시 저장소로 사용 될 byte배열 선언
			byte[] buffer = new byte[1024*8]; // 8192 = 8kb의 buffer
			
			/* inputstream을 통해서 읽어들인 데이터를 임시저장소에 저장하고,
			 * 저장된 데이터의 개수를 length에 저장 
			 */
			
			// FileInputStream의 read()메소드를 통해서 읽어들인 값을 length에 저장
			while((length = src.read(buffer)) != -1) { // src는 input, -1이 아닐때까지 읽음(끝을 의미)
				// outputstream을 통해서 임시저장소에 저장되어 있는 데이터를 length만큼 파일에 기록
				dest.write(buffer, 0, length); // output
			}
			
		}catch (FileNotFoundException fn) {
			fn.printStackTrace();
		}catch(IOException ii) {
			ii.printStackTrace();
		}finally {
			
			try {
				if(dest != null) dest.close();
			}catch(IOException ie) {}
			
			try {
				if(src != null) src.close();
			}catch(IOException ie) {}
		}
		
		long end = System.currentTimeMillis(); // 끝나는 시간
		
		long copyTime = (end -start)/1000;
		System.out.println("걸린시간:" +copyTime+ "초");

	}

}
