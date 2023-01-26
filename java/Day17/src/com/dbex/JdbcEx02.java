package com.dbex;

// UPDATE
import java.sql.*;
public class JdbcEx02 {

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
			
			// Statement 객체 생성(열기)
			stmt = conn.createStatement();
			
			// 4단계 쿼리문 작성
			String sql = "UPDATE DEPARTMENT SET DNAME='컴퓨터공학과' WHERE DEPTNO=203";
			
			// 5단계 쿼리문 실행해서 결과 저장
			int result = stmt.executeUpdate(sql);
			System.out.println(result+" 개의 행이 수정 되었습니다.");
			
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
