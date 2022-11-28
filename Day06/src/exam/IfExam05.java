package exam;

/* 문]
 *     임의의 알파벳 한 문자를 입력받아 모음인지 자음인지를 판정하는 프로그램을 작성하시오.
 *     단, 대소문자 모두 적용하고, 문자외의 문자 입력되면 입력오류를 출력하시오. 
 */

import java.io.*;

public class IfExam05 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.print("알파벳 한 문자 입력 : ");
		char ch = (char)System.in.read();
		
		if((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')) {
			if((ch=='a' || ch =='e' || ch =='i' || ch == 'o' || ch =='u')||(ch=='A' || ch =='E' || ch =='I' || ch == 'O' || ch =='U')) {
				System.out.println("모음 !!!");
			}else{
				System.out.println("자음");
			}
			
			
		}else {
			System.out.println("입력 오류");
		}
		
		

	}

}
