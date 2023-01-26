package arrayexam;

/* 문] 
 * 		임의의 숫자가 들어있는 배열의 숫자 데이터 중
 * 		짝수인 요소만 골라서 출력하고,
 * 		3의 배수인 요소만 골라서 출력하는 프로그램을 작성
 * 		
 * 		임의의 배열에 저장 할 숫자 : 4, 7, 9, 1, 2, 3, 8, 6, 5
 * 
 * 		실행 결과
 * 		배열의 전체 요소 : 4, 7, 9, 1, 2, 3, 8, 6, 5
 * 		짝수 선택 요소 : 4, 2, 6, 8
 * 		3의 배수 : 9 3 6
 * 
 */

public class ArrayEx04 {

	public static void main(String[] args) {
		
		int[] arr = new int[] {4, 7, 9, 1, 2, 3, 8, 6, 5}; 
		System.out.print("배열의 전체 요소 출력");
		for(int i=0 ; i<arr.length ; i++) 
		{	
			System.out.printf("%3d\t", arr[i]);
		}
		
		System.out.println();
		System.out.print("짝수 요소 출력:");
		for(int i=0 ; i<arr.length ; i++) 
		{	
			if(arr[i] %2 ==0)
			System.out.printf("%3d\t", arr[i]);
		}
		System.out.println();
		
		System.out.print("3의 배소 출력:");
		for(int i=0 ; i<arr.length ; i++) 
		{	
			if(arr[i] %3 ==0)
			System.out.printf("%3d\t", arr[i]);
		}
		System.out.println();
		

	}

}
