package arrayexam2;

/*
 * 다음과 같이 배열을 이용하여 출력하시오
 * 1   2   3   4  5
 * 6   7   8   9 10
 * 11 12 13 14 15
 * 16 17 18 19 20
 * 21 22 23 24 25
 * 
 */

public class ArrayEx04 {

	public static void main(String[] args) {
		
		int[][] arr = new int[5][5];
		int n=1;
		
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
	}
}
