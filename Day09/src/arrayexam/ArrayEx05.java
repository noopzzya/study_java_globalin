package arrayexam;

/* 문]
 * char 자료형의 배열에 알파벳 대문자를 채우고 채워진 배열의 전체 요소를 
 * 출력하는 프로그램 작성
 * 
 * 	단, 반복문을 이용하여 배열을 초기화 하시오.
 */

public class ArrayEx05 {

	public static void main(String[] args) {
		char[] arr1 = new char[26];
		// 1.
		arr1[0]='A';
		arr1[1]='B';
		arr1[2]='C';
		arr1[3]='D';
		arr1[4]='E';
		arr1[5]='F';
		arr1[6]='G';
		arr1[7]='H';
		arr1[8]='I';
		arr1[9]='J';
		arr1[10]='K';
		arr1[11]='L';
		arr1[12]='M';
		arr1[13]='N';
		arr1[14]='O';
		arr1[15]='P';
		arr1[16]='Q';
		arr1[17]='R';
		arr1[18]='S';
		arr1[19]='T';
		arr1[20]='U';
		arr1[21]='V';
		arr1[22]='W';
		arr1[23]='X';
		arr1[24]='Y';
		arr1[25]='Z';
		
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		System.out.println();
		System.out.println("============================");
	

		char[] arr2 = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
		for(int i = 0; i<arr1.length; i++) {
			System.out.print(arr2[i]);
		}
		System.out.println();
		System.out.println("============================");
		
		char[] arr3 = new char[26];	
		for(int i=0, b=65 ; i<arr3.length ; i++,b++)
		{
			// 배열의 arr3에 값 할당
			arr3[i] = (char)b;	
		}
		for(int i=0 ; i<arr3.length ; i++)
		{
			System.out.print(arr3[i]);
		}
		System.out.println();
		System.out.println("============================");
		
		char[] arr4 = new char[26];	
		for(int i=0 ; i<arr3.length ; i++)
		{
			// 배열 arr4 값 할당
			arr4[i] = (char)('A'+i);		
		}
		for(int i=0 ; i<arr4.length ; i++)
		{
			System.out.print(arr4[i]);
		}
		
	}

}
