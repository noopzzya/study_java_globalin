package study;

/* 실수형
 *   - float, double
 *  	크기는 : float = 4byte , double=8byte
 *  	실수형의 기본형은 double
 */


public class FloatEx {

	public static void main(String[] args) {
		
		float var1, var2;	// 변수의 선언
		double d;
		// 변수의 초기화
		var1 = 3.4f;
		var2 = 55.55f;
		d = 0.214;
		
		System.out.printf("%.2f\n",var1);
		// %f : 실수형 형식을 지정, 소수점 6자리까지 출력 
		System.out.println("var2:"+var2);
		

	}

}
