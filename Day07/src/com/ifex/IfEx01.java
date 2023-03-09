package com.ifex;

/*	문]
 * 임의의 정수를 입력받아, 입력받은 정수가 양수인지, 음수인지, 0인지 판정
 *  단, BufferedReader와 조건삼항 연산자를 이용하여 출력하시오. 
 *  
 *  정수입력 : 
 *  12 ==> 양수
 *  0 ==> 0
 *  -12 ==> 음수
 *  
 */

import java.io.*;

public class IfEx01 {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
	
		System.out.print("정수입력:");
		
		int n; //정수 입력받은 변수
		String str; //판별 결과를 저장 할 변수
		
		n = Integer.parseInt(br.readLine()); // 숫자 형변환
		
		str = n<0 ? "음수" : (n==0) ? "영":"양수" ;
		System.out.println(n+"==>"+str);
		

	}

}
