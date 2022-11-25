package com.exam;

import java.io.*;
public class Exam04 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 과목명
		String[] subname = {"국어", "영어", "수학"}; 
		int[][][] sub = new int[2][3][subname.length+3]; // [반][사람][과목+3]
		// [subname.length+3] : 6
		// 0:국어, 1:영어, 2:수학, 3:총점, 4:석차, 5:전교석차
		float[][] avg = new float[2][3];
		
		for(int h=0; h<sub.length; h++) { //반
			for(int k=0; k<sub[h].length; k++) { // 인원(학생수)
				for(int i=0; i<sub[h][k].length-3; i++) { // 점수입력공간
					do { // 점수입력
						System.out.print(subname[i]+"점수:");
						sub[h][k][i] = Integer.parseInt(br.readLine());
					}while(sub[h][k][i] < 0 || sub[h][k][i]>100);
					sub[h][k][sub[h][k].length-3] += sub[h][k][i]; // 누적합
				}
				// 평균
				avg[h][k] = sub[h][k][sub[h][k].length-3] / (float)(sub[h][k].length-3);
				
				// 반 석차
				sub[h][k][sub[h][k].length-2] = 1;
						
				// 전교 석차
				sub[h][k][sub[h][k].length-1] = 1;
			}
		} // 입력 끝

		
		// 반석차 구하기
		for(int h=0; h<sub.length;h++) { // 반
			 for(int k=0; k<sub[h].length;k++) { // 첫번째
				for(int i=0; i<sub[h].length; i++) { // 두번째
						if(sub[h][k][sub[h][k].length-3] < sub[h][i][sub[h][i].length-3]){ // 총점 비교
							//첫번째 학생 총점이 적으면 등수는 하나 증가
							sub[h][k][sub[h][k].length-2]++;
					}
				 }
			 }
		}
		
		// 전교석차
		for(int h=0; h<sub.length;h++) { // 반
			 for(int k=0; k<sub[h].length;k++) { // 반 학생
				for(int i=0; i<sub.length; i++) { // 첫번째 학생
					for(int j=0; j<sub[i].length; j++) { // 두번째 학생
						if(sub[h][k][sub[h][k].length-3] < sub[i][j][sub[i][j].length-3]){ //총점기준 비교
							//첫번째 학생이 점수가 적으면 등수는 하나 증가한다
							sub[h][k][sub[h][k].length-1]++;
						}
					}
				 }
			 }
		}
		
		// 총점, 평균, 반석차, 전교석차 출력
		for(int h=0; h<sub.length; h++) {
			for(int k=0; k<sub[h].length; k++) {
				System.out.println();
				System.out.println("총점" + sub[h][k][sub[h][k].length-3]);
				System.out.println("평균" + avg[h][k]);
				System.out.println("석차" + sub[h][k][sub[h][k].length-2]);
				System.out.println("전교석차" + sub[h][k][sub[h][k].length-1]);
				
			}
		}
		
		
	}

}
