package exam;

import java.io.*;

public class Exam03_1 {

	public static void main(String[] args) throws IOException {
		

		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		
		int num1, num2;
		char oper;
		System.out.print("첫번째 정수 입력 : ");
		num1 = Integer.parseInt(br.readLine());
		System.out.print("연산자 입력 : ");
		oper = (char)System.in.read();
		System.in.skip(2);
		System.out.print("두번째 정수 입력 : ");
		num2 = Integer.parseInt(br.readLine());
		
		switch(oper) {
		    case '+':
		    	System.out.printf("%d %c %d = %d",num1, oper, num2, (num1+num2));
		    	break;
		    case '-':
		    	System.out.printf("%d %c %d = %d",num1, oper, num2, (num1-num2));
		    	break;
		    case '*':
		    	System.out.printf("%d %c %d = %d",num1, oper, num2, (num1*num2));
		    	break;
		    case '/':
		    	System.out.printf("%d %c %d = %d",num1, oper, num2, (num1/num2));
		    	break;
		    case '%':
		    	System.out.printf("%d %c %d = %d",num1, oper, num2, (num1%num2));
		    	break;
		    default:
		    	System.out.println("값을 확인 후 다시 입력해주세요.");
		}
		
	}

}
