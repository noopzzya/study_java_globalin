package exam;

/* 문]
 *     주민 번호 7번째 자리를 입력해서 연대와 성별을 출력하는 프로그램을 작성한다.
 */

import java.io.*;

public class SwitchExam01 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		System.out.print("주민번호 7번째 자리를 입력하세요 : ");
		int x = System.in.read() - '0'; 
		int year = 0; // 년도 저장
		String gender =""; // 성별 저장
		
		switch(x) {
		    case 1: case 2: year = 1900; break;
		    case 3: case 4: year = 2000; break;
		    default :
		    	System.out.println("잘못 입력 하셨습니다.");
		    	System.exit(0); // 프로그램 종료
		}
		
		gender = x%2!=0 ? "남성" : "여성";
		
		System.out.println("당신은 " + year +"년대생 " + gender + "이십니다.");
		
	}

}
