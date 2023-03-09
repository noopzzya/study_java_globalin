package arrayexam2;

/* 가변 배열, 레기드 배열, 비정형 배열
 * 
 * - 자바의 배열은 1차원만 관리한다.
 *  형식
 *  int[][] arr = new int[3][];
 *  arr[0] = new int[2];
 *  arr[1] = new int[1];
 *  arr[2] = new int[3];
 * 
 */

public class ArrayEx07 {

	public static void main(String[] args) {
		int[][] arr = new int[3][];
		
		arr[0] = new int[2]; //1행
		arr[1] = new int[1]; //2행
		arr[2] = new int[3]; //3god
		
		//--------------1행의 시작
		arr[0][0] = 100;
		arr[0][1] = 200;
		//--------------1행의 끝
		
		//--------------2행의 시작
		arr[1][0] = 300;
		//--------------2행의 끝
		
		//--------------3행의 시작
		arr[2][0] = 400;
		arr[2][1] = 500;
		arr[2][2] = 600;
		//--------------3행의 끝
		
		//출력
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print("arr[" +i+ "][" +j+ "]:" +arr[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
