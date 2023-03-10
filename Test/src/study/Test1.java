package study;

public class Test1 {

	public static void main(String[] args) {

		/*	 입력 (내 제출)
		int arr[][] = new int[4][];
		int n=1;
		
		arr[0] = new int [1];
		arr[1] = new int [2];
		arr[2] = new int [3];
		arr[3] = new int [4];
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = new int [i+1];
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = n;
				n++;
			}
		}
		*/
		
		// 입력 (선생님)
		
		int cnt = 4;	//배열의 행크기
		int[][] arr = new int[cnt][];	//2차원 배열 선언
		int num = 1;	//숫자 증가값

		//행출력
		for(int i = 0; i < arr.length;i++){
			//레그드 배열 선언 2차 배열공간이 하나씩 늘어난다.
			arr[i] = new int[(i+1)];
			
			//열출력
			for(int j = 0; j < arr[i].length; j++){
				
				//숫자가 하나씩 증가한다. 
				arr[i][j] = num++;
			}		
		}
		
		for(int i=0; i<arr.length; i++) {
			
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
