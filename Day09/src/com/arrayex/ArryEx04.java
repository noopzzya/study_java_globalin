package com.arrayex;

public class ArryEx04 {

	public static void main(String[] args) {
		
		char[] ch = new char[4];
		// 배열의 값 저장
		ch[0] = 'J';
		ch[1]	= 'A';
		ch[2] = 'V';
		ch[3] = 'A';
		
		//System.out.println(ch.length);
		/*					
		for(int i=0 ; i<ch.length; i++)
			System.out.print(ch[i]);
		*/
		/*
		for(int cc : ch)
			System.out.println("cc:"+(char)cc);			
		*/
		
		/*
		int bb[][] = {{2,3},{3,6,9},{4,5,7,8}};
		for(int i = 0; i<bb.length; i++) { //bb.length : 행의 길이
			for(int j = 0; j<bb[i].length; j++) { //bb[i].length : i의 행을 가져감
				System.out.print(bb[i][j]+"\t"); 
			}
			System.out.println();
		}
		*/
		
		ArryEx01[] aa = new ArryEx01[10];
		aa[0] =new ArryEx01();
		
	}
	

}
