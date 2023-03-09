package com.gameex;

/*문8]
	키와 값을 하나의 항목으로 저장하고 검색 수정 가능한 추상 클래스가 있음
	
	PairMap
	이 추상 클래스를 상속받는 Dictionary 클래스를 구현하고 
	실행 클래스인 DictionaryApp을 작성
	
	public class DictionaryApp{
	
		public static void main(String [] args){
			Dictionary dic = new Dictionary(10);
			dic.put("가길동", "자바");
			dic.put("나길동", "파이썬");
			dic.put("나길동", "C++");
			
			System.out.println("나길동의 값은 " +dic.get("나길동"));
			System.out.println("가길동의 값은 " +dic.get("가길동"));
			dic.delete("가길동");
			System.out.println("가길동의 값은 " +dic.get("가길동"));
		}
	}
	
	결과
	나길동의 값은 C++
	가길동의 값은 자바
	가길동의 값은 null
 */

public abstract class PairMap {

	// key들을 저장하는 배열
	protected String keyArray[];
	
	// value들을 저장하는 배열
	protected String valueArray[];
	
	// key값을 가진 value 리턴, 없으면 null 리턴
	abstract String get(String key);
	
	// key와 값을 쌍으로 저장하는 메소드, 키값이 존재하면 값을 수정	
	abstract void put(String key, String value);
	
	// 키 값이 가진 항목삭제, 삭제된 값을 리턴
	abstract String delete(String key);
	
	//현재 저장된 항목을 개수 리턴
	abstract int length();
	
	
}
