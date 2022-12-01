package study;

public class Test5 {

	public static void main(String[] args) {
		/*
		int arr[][] = new int[4][];
		int n=1;
		
		arr[0] = new int [4];
		arr[1] = new int [3];
		arr[2] = new int [2];
		arr[3] = new int [1];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = n;
				n++;
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		*/
		
		// 입력		
		int cnt = 4;	//배열의 행크기
		int[][] arr = new int[cnt][];	//2차원 배열 선언
		int num = 1;	//숫자 증가값
		//행출력
		
		for(int i = 0; i < arr.length;i++){
			//레그드 배열 선언 2차 배열공간이 행이 늘어 날때마다 열의 크기는 하나씩 줄어든다.
			arr[i] = new int[cnt-i];
			
			//열출력
			for(int j = 0; j < arr[i].length; j++){
				
				//숫자가 하나씩 증가한다. 
				arr[i][j] = num++;
			}	
		}
	
		//출력
		for(int i = 0; i < arr.length;i++){
		    for(int j = 0; j < arr[i].length; j++){
				System.out.printf("%3d",arr[i][j]);
			}
			System.out.println();
		}		
	}

}
