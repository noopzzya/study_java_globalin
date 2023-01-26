package com.exam;

import java.io.*;
public class Exam03 {

	public static void main(String[] args)throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int human = Integer.parseInt(args[0]); // 사람 수 구하기
		
		String[] name = new String[human]; // 사람 수 만큼 이름배열 할당

		String[][] subject = new String[human][]; // [행][과목]

		// 점수와 총점처리 할 배열 선언
		int[][] jumsu= new int[human][];
		
		//평균
		float[] avg = new float[human];
		
		//학점
		char[] grade = new char[human];
		
		//석차
		int[] rank = new int[human];
		
		
		for(int i=0; i<human; i++) { // 사람 수 만큼 반복
			
			System.out.print("학생 이름:");
			name[i] = br.readLine();
			
			System.out.print("응시 과목 수:");
			int imsi = Integer.parseInt(br.readLine());
			subject[i] = new String[imsi];
		/*	[0][2]
			[1][3]
			[2][4] */
			
			for(int j=0; j<subject[i].length; j++) {
				System.out.print((j+1)+"번째 응시 과목:");
				subject[i][j] = br.readLine();
			} // 과목명
					
			jumsu[i] = new int[imsi+1]; 
			
			for(int j = 0; j<subject[i].length; j++) {
				System.out.print(subject[i][j]+"과목 점수:");
				jumsu[i][j] = Integer.parseInt(br.readLine()); // 과목별점수
				jumsu[i][jumsu[i].length-1] += jumsu[i][j]; // 누적의 합
			}
		}
		
		// 평균
		for(int i=0; i<human; i++) { 
			avg[i] = jumsu[i][jumsu[i].length-1] / (float)subject.length; // 평균 구함
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
			rank[i]=1; //1
			for(int j = 0; j<human; j++) {
				if(avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}
		System.out.println();
		
		//성적출력
		for(int i=0; i<human; i++) {
			System.out.println("**********" +name[i]+ "성적표 ************");
			System.out.print("이름 \t");
			
			for(int j=0; j<subject[i].length; j++) {
				System.out.print(subject[i][j]+ "\t");
			}
			
			System.out.println("총점\t 평균\t \t학점\t 등수");
			System.out.print(name[i]+"\t");
			
			for(int j=0 ; j<jumsu[i].length; j++) {
				//System.out.print(" "+jumsu[i][j]+ "\t");
				System.out.printf("%3d\t", jumsu[i][j]);
			}
			//System.out.println(" " +avg[i]+ "\t" +grade[i]+ "\t" +rank[i]);
			System.out.printf("%.2f\t%c\t%d\n", avg[i], grade[i], rank[i]);
		}
		System.out.println("*******************************");
	}
	
}
