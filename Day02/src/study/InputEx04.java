package study;


import java.io.*;
/*import java.io.InputStreamReader;
import java.io.IOException;
*/


public class InputEx04 {

	public static void main(String[] args) throws IOException {
		 InputStreamReader isr = new InputStreamReader(System.in);
		 	BufferedReader br = new BufferedReader(isr);
		 	
		 int kor, eng, mat, sum;
		 
		 System.out.print("국어 점수 :");
		 kor = Integer.parseInt(br.readLine()); // kor은 int값, readLine은 문자값 ==> Integer.parseInt 문자열을 정수로 치환
		 System.out.print("영어 점수 :");
		 eng = Integer.parseInt(br.readLine()); 
		 System.out.print("수학 점수 :");
		 mat = Integer.parseInt(br.readLine()); 
		 
		 sum = kor + eng + mat;
		 
		 /*
		 System.out.print("국어점수=" +kor+ "영어점수=" +eng+ "수학점수=" +mat );
		 System.out.println("이며 종합계는 "+sum+" 입니다.");
		 */
		 
		 System.out.printf("국어점수=%d, 영어점수=%d, 수학점수=%d이며 종합계는 %d입니다.", kor,eng,mat,sum);


	}

}
