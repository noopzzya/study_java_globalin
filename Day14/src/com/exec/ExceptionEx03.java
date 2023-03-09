package com.exec;

public class ExceptionEx03 {

	public static void main(String[] args) {
		
			System.out.println(1);
			System.out.println(2);
		
		try {
			System.out.println(3/0);
		}catch (ArithmeticException ae) {
			System.out.println(ae.getMessage());
		}catch (ClassCastException cc) {
			System.out.println(cc.getMessage());
		}catch (Exception e) {
			e.printStackTrace();
		}finally { // 무조건 실행
			System.out.println(6);
		}
	}

}
