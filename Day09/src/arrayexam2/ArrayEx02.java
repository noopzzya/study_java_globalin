package arrayexam2;

/* 문]
 * 		배열을 선언하여 1~9까지 초기화 한 후
 * 		출력하는 프로그램을 작성
 * 
 *		123
 * 		456
 * 		789
 * 
 */

public class ArrayEx02 {

	public static void main(String[] args) {
		
		// 배열의 선언과 초기화
		// 첫번째 방법
		int[][] arr = new int[3][3];
		
		// 배열의 초기화
		// 첫번째 행의 초기화
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		
		// 두번째 행의 초기화
		arr[1][0] = 4;
		arr[1][1] = 5;
		arr[1][2] = 6;
		
		// 세번째 행의 초기화
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		// 배열의 초기화끝
		
		// 두번째 방법
		int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
		
		// 세번째 방법
		int[][] arr2 = new int[3][3];
		int n = 1;
		
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				arr2[i][j] = n; // arr2[0][0] = 1;
				n++; // n=2;			
			}
		}
		// 배열에 저장된 데이터 출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j]+"\t");
			}
			System.out.println();
		}
		
		System.out.println();
		for(int i=0; i<arr1.length; i++) {
			for(int j=0; j<arr1[i].length; j++) {
				System.out.print(arr1[i][j]+"\t");
			}
			System.out.println();
		}	
		
		System.out.println();
		for(int i=0; i<arr2.length; i++) {
			for(int j=0; j<arr2[i].length; j++) {
				System.out.print(arr2[i][j]+"\t");
			}
			System.out.println();
		}	
	}
}
