package arrayexam;

/* 배열 
 * 		-같은 자료형들끼리 모아놓은 하나의 묶음
 * 		-자바에서 하나의 배열은 하나의 객체로 인식
 * 		-동일한 자료형이 여러가 반복될 대 이를 하나의 변수명으로 관리,
 * 			각각의 구분은 순차적인 첨차(인덱스)를 사용함
 * 		-참조 자료형 크기는 4byte
 * 		
 * 		1차원 배열
 * 			배열 선언 : int[] 배열명;
 * 						int 배열명[];
 * 			배열의 초기화 : 배열명 = new 자료형[개수];
 * 						또는 배열명 = {값1, 값2, 값3,.....n};
 * 			new에 의해서 메모리가 할당되면 자동으로 초기화 한다.
 */

public class ArrayEx01 {

	public static void main(String[] args) {
		// 배열 선언
		char[] ch;
		
		// 배열 초기화
		ch = new char[] {'J', 'A', 'V', 'A'}; //ch[0]=0
		
		//배열 값 할당
//		ch[0] = 'J';
//		ch[1] = 'A';
//		ch[2] = 'V';
//		ch[3] = 'A';
		
		// 배열의 길이를 구함
		System.out.println(ch.length);
		
		// 배열 내용 출력
//		for(int i = 0; i<ch.length; i++);
//		System.out.print(ch[i]);
		
		//향상된 for문 (for each)
		for(char c :ch)
			System.out.print(c);
		System.out.println();
		for(int c : ch)
			System.out.print((char)c);
		
		System.out.println();
		System.out.println("===============");
		
		int[] arr = new int[10]; 
		// int[] : 배열 타입
		// arr : 배열에 대한 레퍼런스 변수 (참조변수)
		// new : 배열 생성
		// int : 자료형 의미
		// [10] : 배열의 개수 (원소 개수)
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		//1,2,3,0,0,0,0,0
		System.out.println(arr[3]);
		
		for(int i=0 ; i<arr.length ; i++) {
			System.out.printf("%2d", arr[i]);
			
		}
		
	}

}
