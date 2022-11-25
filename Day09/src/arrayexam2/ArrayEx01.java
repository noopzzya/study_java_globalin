package arrayexam2;

/*
 *  2차원 배열 (다차원 배열)
 *  	- 1차원 배열과 마찬가지로 2차원 배열에서도 레퍼런스 변수 선언 후 배열을 생성
 *  	- 2차원 배열의 레퍼런스 변수를 선언하는 방법은 두가지
 *  
 *  	int arr[][];
 * 		char arr[][];
 * 		double arr[][]; 
 *  
 *  	int[][] arr;
 *  	char[][] arr;
 *  	double[][];
 *  
 *  	배열생성 => 메모리 공간을 만든다.
 *  	arr = new int[2][5]; 		//[행][열] ==> 배열의 크기 : 행*열
 *  	arr = new char[2][5];
 *  	arr = new double[2][5];
 *  
 *  	2차원 배열의 초기화
 *  	int arr[][] = {{0,1,2}.{3,4,5},{6,7,8}};
 *  	char arr[][] = {'a','b','c','d'},{'e','f','g','h'};
 *  	double arr[][] = {{0.01,0.02},{0.03,0.04}};
 
 *  
 */

public class ArrayEx01 {
	
	public static void main(String[] args) {
		int[][] test; //2차원 배열 선언
		test = new int[2][3]; // 배열 생성
		
	// -- 첫번째 행 시작
		test[0][0] = 100;
		test[0][1] = 200;
		test[0][2] = 300;
	//	-- 첫번째 행 끝
		
	// -- 두번째 행 시작
		test[1][0] = 400;
		test[1][1] = 500;
		test[1][2] = 600;
	//	-- 두번째 행 끝
		// 배열의 초기화
		
		// 배열의 값 출력
		for(int i=0 ; i<test.length; i++) { // 행
			// test.length ==> 2차원 배열의 행의 개수
			// test[0].length ==> 첫번째 행의 열의 개수
			for(int j=0; j<test[i].length; j++) { // 열
				System.out.print("test[" +i+ "][" +j+ "]:" +test[i][j] + "\t");
			}
			System.out.println(); //행 끝나고 줄 바꿈
		}
		
		
	}
}








