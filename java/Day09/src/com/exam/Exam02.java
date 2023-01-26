package com.exam;

import java.io.*;
public class Exam02 {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		//System.out.print("응시 학생 수:");
		int human = Integer.parseInt(args[0]); // 사람 수 구하기
		String[] name = new String[human]; // 사람 수 만큼 이름배열 할당
		//System.out.println(name.length);
		String[] subject = new String[args.length-1]; //과목명 초기화

		// 점수와 총점처리 할 배열 선언
		int[][] jumsu= new int[human][args.length];
		
		//평균
		float[] avg = new float[human];
		
		//학점
		char[] grade = new char[human];
		
		//석차
		int[] rank = new int[human];
		

		for(int i = 0; i<args.length-1; i++) {
			subject[i] = args[i+1];
			//System.out.print(subject[i]); // 과목명 옮겨옴
		}
		
		
		for(int i=0; i<human; i++) { // 사람 수 만큼 반복
			System.out.print((i+1)+"번째 학생 이름:");
			name[i] = br.readLine();
			System.out.println(name[i] +"학생 점수 입력");
			for(int j = 0; j<subject.length; j++) {
				System.out.print(subject[j]+"점수:");
				jumsu[i][j] = Integer.parseInt(br.readLine()); // 과목별점수
				jumsu[i][subject.length] += jumsu[i][j]; // 누적의 합
			}
		}
		for(int i=0; i<human; i++) { 
			avg[i] = jumsu[i][subject.length] / (float)subject.length; // 평균 구함
			avg[i]= (int)((avg[i]+0.005)*100) / 100.0f;  //소수점2자리. 백분률 정밀도 높은 공식
		}
		
		for(int i = 0; i<human; i++) {
			switch ((int)(avg[i]/10)) { //평균값 float라 형변환 필수
			case 10:
			case 9: grade[i] = 'A';break;
			case 8: grade[i] = 'B';break;
			case 7: grade[i] = 'C';break;
			case 6: grade[i] = 'D';break;
			default : grade[i] = 'F';break;
			}
		}
		
		// 석차 계산
		for(int i = 0; i<human; i++) {
			rank[i]++; //1
			for(int j = 0; j<human; j++) {
				if(avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println();
		
		//성적출력
		
		System.out.println("************ 성적표 **************");
		System.out.print("이름 \t");
		for(int i=0; i<subject.length; i++) {
			System.out.print(subject[i]+ "\t");
		}
		
		System.out.println("총점\t 평균\t \t학점\t 등수");
		
		for(int i=0; i<human; i++) {
		System.out.print(name[i]+"\t");
			for(int j=0 ; j<subject.length+1; j++) {
				//System.out.print(" "+jumsu[i][j]+ "\t");
				System.out.printf("%3d\t", jumsu[i][j]);
			}
			//System.out.println(" " +avg[i]+ "\t" +grade[i]+ "\t" +rank[i]);
			System.out.printf("%.2f\t%c\t%d\n", avg[i], grade[i], rank[i]);
		}
		
		System.out.println("*******************************");

	 
	}
	

}
