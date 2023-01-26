package exam;

/*	문5.
 * 		국어, 영어, 수학 점수를 입력받아 합계를 구하는 프로그램작성
 * 
 * 문6.
 * 		위 5번 문제를 이용하여 평균을 구하는 프로그램을 작성하시오. 단 소수점 이하 2자리 까지 출력하는 프로그램을 작성하시오.
 * 
 */

import java.io.*;

public class Ex05_06 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = 
				new BufferedReader(new InputStreamReader(System.in));
	
	//5번	
		int kor, eng, mat, sum = 0; //누적변수
		
		System.out.print("국어점수:");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어점수:");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학점수:");
		mat = Integer.parseInt(br.readLine());
		
		sum = kor+eng+mat;
		
		System.out.println("세 과목 총점음 :" +sum+"입니다.");
		
	//6번
		float avg = (float)(sum /3.0);
		System.out.printf("평균은 %.2f", avg); //printf 인 경우 , 로 표현


	}

}
