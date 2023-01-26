package study;

/*byte : 1byte 자료형이며, 입출력 범위 : -128 ~ 127
 */


public class ByteEx {

	public static void main(String[] args) {
		
		byte bb = 127;
		// java는 컴파일 시 컴파일러가 에러를 발생시킨다.
		// 단, 초기값일 경우 
		bb--;
		
		//bb=bb+1;
		bb++;
		System.out.println(bb);

	}

}
