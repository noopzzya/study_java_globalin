package study;

/* 입력, 출력 시에는 반드시 주의사항이 필요
 * 입출력에 관련된 라이브러리를 추가해야함
 * import java.io.*; 
 * 
 * 그리고
 * 메인 메소드(함수) 뒤에 반드시 throws IOException(예외 전가)을 기록해야함
 * 
 */

import java.io.*;

public class InputEx01 {

	public static void main(String[] args) throws IOException {

	/* ASCII Code 입력받음
	 * 0~9 : 48~57
	 * A~Z : 65~90
	 * a~z : 97~122
	 */

		System.out.print("문자 입력 :"); //안내메세지, 숫자X
		
		int a = 100;
		//int i = System.in.read();
		
		//한 문자를 입력받음
		char ch = (char)System.in.read(); //명시적 형변환 (강제형변환)
		
		System.out.println(ch);
		
	
	}

}
