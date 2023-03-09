package com.dbex;

/*
 * 	1단계
 * 		import java.sql.*
 * 
 * 2단계
 *  	특정 드라이버 검색
 *		oracle : thin Driver 사용
 *			oracle.jdbc.driver.OracleDriver
 *		Class.forName("oracle.jdbc.driver.OracleDriver");
 *
 * 3단계
 * 		Connection conn = DriverManager.getConnection(
 * 		url, :  jdbc:oracle:thin:@localhost:1521:sid(orcl)
 * 		id, : scott
 * 		password : tiger); // 매개변수 3개
 * 
 *  4단계 (Query문 작성)
 *  정적
 *  	Statement Class(정적)
 *  	Statement stmt = conn.createStatement();
 *  동적
 *  	PreparedStatement Class(동적)
 *  	preparedStatement pstmt = conn.prepareStatement(query);
 *  
 * 5단계 : 결과 저장
 * 		(정적) : 필드값이 정해져 있을 경우
 * 		ResultSet rs = stmt.executeQuery(query); // SELECT
 * 		ResultSet rs = stmt.executeUpdate(query); // INSERT, UPDATE, DELETE
 * 		(동적) : 미정일 경우
 * 		ResultSet rs = pstmt.executeQuery(query); // SELECT
 * 		ResultSet rs = pstmt.executeUpdate(query); // INSERT, UPDATE, DELETE
 * 
 *  6단계
 *  	사용 후 반드시 close()
 */


import java.sql.*; // 1단계
public class JdbcEx01 {

	public static void main(String[] args) {
		
		Connection conn = null; // 초기값 null
		Statement stmt = null;
		
		try {
			// 2단계 : jdbc 드라이버 메모리에 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			// 3단계
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String id = "scott";
			String password = "tiger";
			conn = DriverManager.getConnection(url, id, password); 
			
			/* 3단계 (둘 중 1개 사용)
			conn = DriverManager.getConnection(
					"jdbc:oracle:thin:@localhost:1521:orcl",
					"scott", "tiger");
			*/			
			// System.out.println("데이터베이스 연결 성공!"); // 연결확인용
			
			// Statement 객체 생성(열기)
			stmt = conn.createStatement();
			
			// 4단계 쿼리문 작성
			String sql = "insert into department values(203, '제어계측공학과', 200, '7호관')";
			
			// 5단계 쿼리문 실행해서 결과 저장
			int result = stmt.executeUpdate(sql);
			System.out.println(result+" 개의 행이 추가 되었습니다.");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException se) {
			se.printStackTrace();
		}finally {
			try {
				if(conn != null) conn.close(); // 6단계
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
			
			try {
				if(stmt != null) stmt.close(); // 6단계
			} catch (SQLException ss) {
				ss.printStackTrace();
			}			
		}

	}

}
