package com.methodex;

public class MyClassEx {

	public static void main(String[] args) {
		
		MyClass mc = new MyClass();
		MyClass mc1 = new MyClass("가길동");
		MyClass mc2 = new MyClass("나길동",23);
		MyClass mc3 = new MyClass(26,"다길동");
		
		System.out.println(mc.getName()+ ", " +mc.getAge());
		System.out.println(mc1.getName()+ ", " +mc1.getAge());
		System.out.println(mc2.getName()+ ", " +mc2.getAge());
		System.out.println(mc3.getName()+ ", " +mc3.getAge());
	}

}
