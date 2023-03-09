package com.vscore;

public interface Score { // public void 생성

	// 추가
	public void insert();
	
	// 변경(수정)
	public void update();
	
	// 삭제
	public void delete();
	
	// 전체 목록
	public void listAll();
	
	// 학번 검색
	public void searchHak();
	
	// 이름 검색
	public void searchName();
	
}
