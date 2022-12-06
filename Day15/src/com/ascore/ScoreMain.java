package com.ascore;

public class ScoreMain {

	public static void main(String[] args) throws Exception{
		
		char ch;
		Score score = new ScoreImpl();
		
		while(true) {
			
			do {
				System.out.print("1.추가 2.수정 3.삭제 4.전체보기 5.학번검색 6.이름검색 7.종료: ");
				ch = (char)System.in.read();
				System.in.read();
				System.in.read();
			}while(ch < '1' || ch > '7');
			
			switch (ch) {
			case '1' : score.insert(); break;
			case '2' : score.update(); break;
			case '3' : score.delete(); break;
			case '4' : score.listAll(); break;
			case '5' : score.searchHak(); break;
			case '6' : score.searchName(); break;
			case '7' : System.out.println("프로그램을 종료합니다.");
						System.exit(0);
			}			
		}
	}

}
