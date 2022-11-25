package study;

/*
 * 	Wrapper : 기본 데이터형(자료형)의 class화 시킨 것
 * 
 *	byte --> Byte , short --> Short , int --> Integer
 * long --> Long
 * 
 * float --> Float , double --> Double
 * 
 *  boolean --> Boolean , char --> Character
 * 
 */


public class WrapperEx {

	public static void main(String[] args) {
		byte a_min = Byte.MIN_VALUE;
		byte a_max = Byte.MAX_VALUE;
		
		// 변수를 상수화 시킴
		int a = 7;
		a=10;
		
		float f_min = Float.MIN_VALUE;
		
		int aa;
		

		System.out.println(a_min);
		System.out.println(a_max);
		
		System.out.println(f_min);
		
		char c_min = Character.MIN_VALUE;
		char c_max = Character.MAX_VALUE;
		//System.out.println(c_min);
		System.out.println(c_max);
		
		
		
	}

}
