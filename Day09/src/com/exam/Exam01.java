package com.exam;

import java.io.*;
public class Exam01 {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		if(args.length == 0) { // args.langth == 과목수(과목명)
			System.out.println("Usage : java Exam01 subject1 subject2...");
			System.exit(0);
		} 
		
		// 이름 입력 안내 메시지
		System.out.print("이름 입력:");
		String name = br.readLine();
		
		// 과목수만큼의 공간 생성
		String[] subject = new  String[args.length];
		//String[] subject = {"국어", "영어", "수학"};
		
		// args.length = 과목명을 subject 배열에 옮긴다.
		for(int i = 0; i<args.length; i++) {
			subject[i] = args[i];
			// subject = args, subject.length => 과목 수
		}
		int jumsu[] = new int[subject.length+1]; 
		// 과목 다음 마지막에 점수의 공간을 할당
		
		for(int i =0; i<jumsu.length-1; i++) {
			System.out.print(subject[i] + "점수:");
			jumsu[i] = Integer.parseInt(br.readLine()); // 과목별 점수
			jumsu[jumsu.length-1] += jumsu[i]; // 누적의 합			
		}
		//System.out.println(jumsu[jumsu.length-1]);
		float avg = jumsu[jumsu.length-1] / (float)subject.length;
		//System.out.println(jumsu[jumsu.length-1]);
		avg = (int)((avg+0.005)*100) / 100.0f;  //소수점2자리. 백분률 정밀도 높은 공식
		//System.out.println(avg);
		
		//학점
		char grade = ' '; // 0 또는 빈칸 가능
		
		switch ((int)(avg/10)) { //평균값 float라 형변환 필수
		case 10:
		case 9: grade = 'A';break;
		case 8: grade = 'B';break;
		case 7: grade = 'C';break;
		case 6: grade = 'D';break;
		default : grade = 'F';break;
		} //학점 평가 끝
		System.out.println();
		
		//성적출력
		System.out.println("************ 성적표 **************");
		System.out.print("이름 \t");
		for(int i=0; i<subject.length; i++) {
			System.out.print(subject[i]+ "\t");
		}
		System.out.println("총점\t 평균\t 학점");
		
		System.out.print(name+"\t");
		for(int i=0 ; i<subject.length+1; i++) {
			System.out.print(" "+jumsu[i]+ "\t");
		}
		System.out.println(" " +avg+ "\t" +grade);
		
	
		
		System.out.println("*******************************");
		
	}
	

}
