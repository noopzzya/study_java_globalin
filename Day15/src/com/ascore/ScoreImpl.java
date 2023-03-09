package com.ascore;

import java.util.*;
public class ScoreImpl implements Score {
	
	//private Vector<ScoreVO> list = new Vector<>();
	private List<ScoreVO> list = new ArrayList<>(); // List가 Vector보다 메모리 낭비 없음
	private Scanner sc = new Scanner(System.in);

	@Override
	public void insert() {
	System.out.println("\n 자료 추가...");
	
	String hak;
	System.out.print("학번: ");
	hak = sc.next();
	
	ScoreVO temp = readScore(hak);
	if(temp !=null) {
		System.out.println("이미 등록된 학번입니다.");
		return;
	}
	
	ScoreVO vo = new ScoreVO();
	vo.setHak(hak);
	System.out.print("이름:");
	//String name = ;
	vo.setName(sc.next());
	System.out.print("생년월일:");
	vo.setBirth(sc.next());
	System.out.print("국어:");
	vo.setKor(sc.nextInt());
	System.out.print("영어:");
	vo.setEng(sc.nextInt());
	System.out.print("수학:");
	vo.setMat(sc.nextInt());
	
	list.add(vo);
	System.out.println("자료 추가 되었습니다. \n");

	}

	@Override
	public void update() {
		System.out.println("\n 자료 수정...");
		String hak;
		System.out.print("수정 할 학번:");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		
		if(vo == null) {
			System.out.println("등록된 학번이 없습니다. \n");
			return;
		}
		
		System.out.print("이름:");
		//String name = ;
		vo.setName(sc.next());
		System.out.print("생년월일:");
		vo.setBirth(sc.next());
		System.out.print("국어:");
		vo.setKor(sc.nextInt());
		System.out.print("영어:");
		vo.setEng(sc.nextInt());
		System.out.print("수학:");
		vo.setMat(sc.nextInt());
		
		System.out.println("자료가 수정 되었습니다. \n");

	}

	@Override
	public void delete() {
		System.out.println("\n 자료 삭제...");
		String hak;
		
		System.out.print("삭제 할 학번:");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		
		if(vo ==  null) { // 자료가 벡터에 없을 때
			System.out.println("등록된 자료가 없습니다.");
			return;
		}
		
		list.remove(vo);
		
		System.out.println("자료가 삭제 되었습니다. \n");
		
	}

	@Override
	public void listAll() {
		System.out.println("\n 전체 출력");
		Iterator<ScoreVO> it = list.iterator();
		
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo);
		}
		System.out.println();
	}

	@Override
	public void searchHak() {
		System.out.println("\n 학번 검색...");
		
		String hak;
		System.out.print("검색 할 학번:");
		hak = sc.next();
		
		ScoreVO vo = readScore(hak);
		
		if(vo != null) {
			System.out.println(vo); toString();
			
			/*
			if(vo != null) {
				System.out.print(vo.getHak()+ "\t");
				System.out.print(vo.getName()+ "\t");
				System.out.print(vo.getBirth()+ "\t");
				System.out.print(vo.getKor()+ "\t");
				System.out.print(vo.getEng()+ "\t");
				System.out.print(vo.getMat()+ "\t");
				System.out.print(vo.getTot()+ "\t");
				System.out.print(vo.getTot()+ "\t");			
			}
			*/	
			
		}else {
			System.out.println("검색한 자료가 존재하지 않습니다.");
		}
		System.out.println();
	}

	@Override
	public void searchName() {
		System.out.println("\n 이름 검색...");
		
		String name;
		System.out.print("검색할 이름:");
		name = sc.next();
		
		for(ScoreVO vo : list) {
			if(vo.getName().startsWith(name)) { // 시작 첫글자 메소드
				System.out.println(vo);
			}
		}
		System.out.println();
	}
	
	// 벡터 안에 정보를 읽어오는 기능 readScore(String hak)
	public ScoreVO readScore(String hak) {
		ScoreVO vo = null;
		
		for(ScoreVO temp : list) {
			if(temp.getHak().equals(hak)) {
				vo = temp;
				break;
			}
		}
		
		return vo;
	}

}
