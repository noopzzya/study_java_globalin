package study;

/*	shift
 * 		>> 오른쪽 시프트 : 절반이 감소
 * 		<< 왼쪽 시프트 : 절반이 증가 *2 (이진법으로 1칸 이동 시 2배 증가)
 */

public class BitOperExam04 {

	public static void main(String[] args) {
		
		int x = 128; // 10000000
		
		System.out.println(x << 3);	 // 10000000000 = 1024
		System.out.println(x >> 3);	//10000 = 16

	}

}
