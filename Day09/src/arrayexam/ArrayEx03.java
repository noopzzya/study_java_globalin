package arrayexam;

import java.io.*;
public class ArrayEx03 {

	public static void main(String[] args)throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String[] subname = {"국어", "영어", "수학"}; // 과목명
		//0, 1, 2
		int[] sub = new int[subname.length+1]; // 총합계 : 3 (+1:합계 1추가)
		//int[] sub = new int[4];
		
		float avg = 0.0f;
		
		for(int i=0; i<sub.length-1; i++) { //0부터 시작해서 하므로 length-1
			// 과목점수
			do {
				System.out.print(subname[i]+" 점수:");
				sub[i] = Integer.parseInt(br.readLine());
			}while(sub[i]<0 || sub[i]>100);
			
			// 총 합계			
			sub[sub.length-1] += sub[i]; // 누적 합계 sub[3]+=sub[i]
		}
		// 평균 계산
		avg = sub[sub.length-1] / (float)(sub.length-1);
		
		System.out.println("국어점수:" +sub[0]+ ", 영어점수:" +sub[1]+ ", 수학점수:"+sub[2]);
		System.out.println("총점:" +sub[3]);
		System.out.printf("평균: %.2f", avg);
		
	}

}
