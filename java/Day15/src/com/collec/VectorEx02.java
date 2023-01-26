package com.collec;

import java.util.*;
public class VectorEx02 {

	private static final String colors[] = 
		{"검정", "노랑", "녹색", "청색", "빨강", "연두색"};
	
	public static void main(String[] args) {
		
		Vector<String> v = new Vector<String>();
		System.out.println("벡터의 크기:" +v.capacity()); // 벡터의 크기는 2배로 증가
		
		for(String str : colors)
			v.add(str);
		
		System.out.println("요소의 개수:" +v.size());
		
		System.out.println("첫번째 인덱스 값:" +v.firstElement());
		System.out.println("두번째 인덱스 값:" +v.get(1));
		System.out.println("마지막 인덱스 값:" +v.lastElement());
		
		// 두번째 값을 핑크색상으로 변경
		v.set(1, "분홍색");
		System.out.println("두번째 인덱스 값:" +v.get(1));
		System.out.println("요소의 개수:" +v.size());
		
		// 두번째 요소 값 삭제
		v.remove(1);
		System.out.println("요소의 개수:" +v.size());
		System.out.println("벡터의 크기:" +v.capacity());
		
		//첫번째 요소에 하늘색 추가
		v.insertElementAt("하늘색",0);
		System.out.println("첫번째 인덱스 값:" +v.firstElement());
		System.out.println("요소의 개수:" +v.size());
		
		// 전체 출력
		for(String str : v) {
			System.out.print(str+ " ");
		}
		
		// 오름차순 정렬 : ㄱㄴ...
		Collections.sort(v);
		System.out.println("\n 오름차순 정렬 후:");
		for(String str:v)
			System.out.print(str+ " ");
		System.out.println();
			
		// 검색
		int idx = Collections.binarySearch(v, "녹색");
		// 오름차순 정렬된 자료에서만 가능
		System.out.println("\n 녹색:" +idx+ " index에 위치");
		// 검색 자료가 벡터 안에 없을 경우 음수를 출력한다.
		
		// 내림차순 정렬
		Collections.sort(v, Collections.reverseOrder());
		System.out.println("\n 내림차순 정렬 후:");
		for(String str:v)
			System.out.print(str+ " ");
		System.out.println();
		
		// 내림차순 검색
		idx = Collections.binarySearch(v, "녹색", Collections.reverseOrder());
		System.out.println("\n 녹색:" +idx+ " index에 위치");
		// 없으면 음수 출력
		
		String s = "검정";
		if(v.contains(s)) {
			int i = v.indexOf(s)+1; // 인덱스가 0이라 순서시작을 1부터 하기 위해 +1
			System.out.println(s+ "--> 위치:" +i);
		}
	}

}
