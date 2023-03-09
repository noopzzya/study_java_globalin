package com.mapex;

import java.util.*;
public class HashMapEx02 {

	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("aaaa", "1111");
		map.put("bbbb", "2222");
		map.put("cccc", "3333");
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.print("id와 password 입력:");
			String id = sc.next();
			String pw = sc.next();
			
			System.out.println();
			
			if(!map.containsKey(id)) { // id가 존재하지 않으면
				System.out.println("입력하신 id는 없는 아이디 입니다.");
				continue;
			}else { // id가 존재하면 
				if(!(map.get(id).equals(pw))){
					System.out.println("비밀번호가 일치 하지 않음 다시 입력 바람...");
				}else {
					System.out.println("id와 비밀번호가 일치합니다.");
					//login();
					break;
				}
			}
			
		}
	}

}
