package study;

/*	swap (교환 : 자리 바꿈)
 * 	 int a, b, temp;
 * 
 * 	temp = a;
 *  a=b;
 *  b=temp;
 */

public class BitOperExam03 {

	public static void main(String[] args) {
		
		int a = 5, b = 3;
		int temp;
		
		
		/*
		a = a ^ b;
		b = b ^ a;
		a = a ^ b;
		*/
		
		temp = a; // 5 = _
		a = b;	// 3 = _
		b = temp; // 5 = _
		
		System.out.println("a : "+a+", b : "+b);
		

	}

}
