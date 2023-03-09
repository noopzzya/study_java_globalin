package exam;

/* 문]
 *     사용자로부터 임의의 정수 두개와 연산자를 입력받아
 *     해당 연산자의 처리 결과를 출력하는 프로그램을 작성하시오.
 *     
 *     단, if문으로 구현하고 모든 수를 정수처리한다.
 *     
 *     출력형식
 *     
 *     ex)
 *     첫번째 정수 : 10
 *     연산자 [+,-,*,/,%] : +
 *     두번째 정수 : 14
 *     
 *     
 *      10 + 14 = 24
 */
import java.io.*;

public class Exam03 {

	public static void main(String[] args) throws IOException {
		
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		int num1, num2, result;
		System.out.print("첫번째 정수 : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("연산자 [+,-,*,/,%] : " );
		char oper = (char)System.in.read();
		System.in.skip(2);
		System.out.print("두번째 정수 : ");
		num2 = Integer.parseInt(br.readLine());
		
		
		if(oper == '+') {
			System.out.printf("%d %c %d = %d",num1, oper, num2, (num1+num2));
		} else if (oper == '-') {
			System.out.printf("%d %c %d = %d",num1, oper, num2, (num1-num2));
		} else if (oper == '*') {
			System.out.printf("%d %c %d = %d",num1, oper, num2, (num1*num2));
		} else if (oper == '/') {
			System.out.printf("%d %c %d = %d",num1, oper, num2, (num1/num2));
		} else if (oper == '%') {
			System.out.printf("%d %c %d = %d",num1, oper, num2, (num1%num2));
		} else {
			System.out.println("값을 확인 후 다시 입력해주세요.");
		}
		
		
		
		

	}

}
