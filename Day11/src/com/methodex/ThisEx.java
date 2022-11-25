package com.methodex;

/*	this와 this()
 * 
 * this
 * - this란 특정 객체 내에서 자신이 생성되었을 때 참조변수를 의미
 * - 객체의 주소는 생성 전 까지는 모르기 때문에 객체 생성 후 자신의 주소로 대치 됨
 * 
 * this()
 * - 현재 객체의 생성자를 의미
 * - 생성자 안에서 오버로딩 된다른 생성자를 호출 할 경우 this()라는 키워드로 호출 
 */

public class ThisEx {

	String name, jumin, tel; // 멤버 필드
	
	// 생성자를 활용해 초기화
	public ThisEx() { // 기본생성자
		this.name = "Guest";
		this.jumin = "000000-0000000";
		tel = "000-0000-0000"; // 기본생성자는 this 생략가능 (클래스 멤버필드 의미)
	}
	
	public ThisEx(String name) { // 생성자 오버로딩
		this(); // 기본생성자(This Ex()) 호출 한 것으로 맨위에 써야함!
		this.name = name;
	}
	
	public ThisEx(String name, String jumin) { // 생성자 오버로딩
		this(name); // 매개변수 있음
		this.jumin = jumin;
	}
	
	public ThisEx(String name, String jumin, String tel) { // 생성자 오버로딩
		this(name, jumin);
		this.tel = tel;
	}
	
	public String getName() { // Getters 출력
		return name;
	}

	public String getJumin() {
		return jumin;
	}

	public String getTel() { // toString 출력
		return tel;
	}

//	@Override
//	public String toString() {
//		// TODO Auto-generated method stub
//		return "이름:" +name+ ", 주민번호:" +jumin+ ", 전화번호:" +tel;
//	}
	
}
