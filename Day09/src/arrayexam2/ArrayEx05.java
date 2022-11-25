package arrayexam2;

import java.io.*;
public class ArrayEx05 {

	public static void main(String[] args)throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] subname = {"국어", "영어", "수학"};
		int[][] sub = new int[3][subname.length+1]; // subname.length+1 : 3과목+총점
		// 0:첫번째사람, 1:두번째사람, 2:세번째사람, 3:총점, 4:석차
		float[] avg = new float[3];
		
		for(int k=0; k<sub.length; k++) { // 사람:3
			System.out.println((k+1)+"번째 사람");
			for(int i=0; i<sub[k].length-1; i++) { // sub[k].length-1 : 과목수
				do {
					System.out.print(subname[i]+"점수:");
					sub[k][i] = Integer.parseInt(br.readLine());
				}while(sub[k][i] < 0 || sub[k][i] > 100); // 점수 입력 끝
				
				// 총점 구함
				sub[k][sub[k].length-1] += sub[k][i];
			}
			// 평균
			avg[k] = sub[k][sub[k].length-1] / (float)(sub[k].length-1);
//			System.out.println();
//			System.out.println("총점:" +sub[k][sub[k].length-1]);
//			System.out.println("평균:" +avg[k]);
		}
		
		// 출력
		for(int k=0; k<sub.length; k++) {
			System.out.println();
			System.out.println("총점:" +sub[k][sub[k].length-1]);
			System.out.println("평균:" +avg[k]);
		}	
	}
}
