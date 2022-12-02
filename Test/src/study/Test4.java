package study;

public class Test4 {

	public static void main(String[] args) {
			
		/*
		int arr[][] = new int[5][4];
		int n=1;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = 4*j+n;	
			}
			n++;			
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = n;	
				n++;	
			}	
		}
		
		for(int i=0; i<arr[0].length; i++) {
			for(int j=0; j<arr.length; j++) {
				System.out.print(arr[j][i]+"\t");
			}
			System.out.println();
		}
		*/
	
		int cnt_i = 4;	//배열의 행 크기
		int cnt_j = 5;	//배열의 열 크기
		int[][] arr = new int[cnt_i][cnt_j];	//2차원 배열 선언
		
		//행출력
		for(int i = 0; i < arr.length;i++){
				
			//열출력
			for(int j = 0; j < arr[i].length; j++){
				
				//숫자가 하나씩 증가한다. 
				//행의 시작값은 행인덱스 +1 로 시작되고 열은 행의 크기 * 열의 인덱스 이다.
				arr[i][j] = ( i + 1 ) + (cnt_i*j);
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
