package com.arrayex;

public class ArryEx03 {

	public static void main(String[] args) {
		
		int[][][] aa = new int [2][3][4];
	//	int[][][] aa = new int [면][행][열]; 배열 크기 : 면 * 행 * 열
	
		int i, j, k, val=1;
		for(k=0 ; k<2 ; k++) { //면
			for(i=0 ; i<3 ; i++) { //행
				for(j=0 ; j<4 ; j++) { //열
					aa[k][i][j] = val;
					val++;
				}
			}			
		}
		
		
	}

}
