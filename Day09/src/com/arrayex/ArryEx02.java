package com.arrayex;

public class ArryEx02 {

	public static void main(String[] args) {
		
		//int[][] aa = new int[3][4];
		//int[][] aa = new int[행][열] 배열의 크기 : 행 * 열 : 12 
			/*
			int i, k;
			int val = 1;
			
			// 배열에 데이터 저장
			for(i=0 ; i<3 ; i++) { //배열은 0부터 시작
				for(k=0 ; k<4 ; k++) {
					aa[i][k] = val;
					val++;
				}
			}
			*/
		
			//배열의 선언과 동시에 초기화
			int [][][] aa= { //면
				{ // 첫번째 면
				{1, 2, 3,  4}, //행
				{ 5, 6, 7, 8}, //행
				{9, 10, 11, 12} //행
				//열, 열, 열, 열
				}, 
				//면 구분
				{ //두번째 면
					{1, 2, 3,  4}, //행
					{ 5, 6, 7, 8}, //행
					{9, 10, 11, 12} //행
					//열, 열, 열, 열
				}
			};
			
			int i, k, j;
			int val = 1;
			
			for(i=0 ; i<2 ; i++) { //배열은 0부터 시작
				for(k=0 ; k<3 ; k++) {
					for(j=0; j<4 ;j++) {
						System.out.printf("%d",aa[i][k][j]);
					}
					System.out.println();
				}
				System.out.println();
			}
			
			
			/*
			 int i, k;
			// 배열에 저장된 데이터를 출력
			for(i=0 ; i<3 ; i++) {
				for(k=0 ; k<4 ; k++) {
					System.out.printf("%5d",aa[i][k]);
				}
				System.out.println();
			}
			*/
			
			System.out.println();
	}
}
