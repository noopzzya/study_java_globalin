package exam;

/* 문]
 *      숫자를 입력받아 3 ~ 5는 봄, 6 ~ 8은 여름, 9 ~ 11은 가을, 12 ~ 2의 경우 겨울
 *      그 외 숫자를 입력하면 잘못 입력하셨습니다. 를 출력하는 프로그램을 작성하시오.
 *      단, if문과 switch ~ case문을 활용하시오.
 *      
 *      출력형식
 *      
 *      달을 입력하세요(1 ~ 12) >> 9
 *      가을
 */

import java.util.*;

public class Exam08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("달을 입력하세요(1 ~ 12) >> ");
		int season = sc.nextInt();
		
		if(season>=1 && season <= 12) {
			if(season>=3 && season <=5) {
				System.out.println("봄");
			} else if (season>=6 && season <=8) {
				System.out.println("여름");
			} else if (season>=9 && season<=11) {
				System.out.println("가을");
			} else {
				System.out.println("겨울");
			}
		} else {
			System.out.println("달을 벗어났습니다.");
		}
		
		
		switch(season) {
		    case 3: case 4: case 5: 
		    	System.out.println("봄");
		    	break;
		    case 6: case 7: case 8:
		    	System.out.println("여름");
		    	break;
		    case 9: case 10: case 11:
		    	System.out.println("가을");
		    	break;
		    case 12: case 1: case 2:
		    	System.out.println("겨울");
		    	break;
		    default :
		    	System.out.println("달을 벗어났습니다.");
		}
		
	}

}
