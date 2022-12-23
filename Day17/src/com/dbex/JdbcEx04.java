package com.dbex;

// SELECT
import java.sql.*;
public class JdbcEx04 {

	public static void main(String[] args) {
		
		Connection conn = null; // 초기값 null
		Statement stmt = null;
		
		ResultSet rs = null;
		/*
		 * SELECT문으로 실행한 결과를 저장한 집합체
		 * 데이터를 추출 할 수 있는 메소드를 가지고 있는 객체가 ResultSet
		 */
		
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
			String sql = "SELECT DEPTNO, DNAME, COLLEGE, LOC FROM DEPARTMENT";
			
			rs = stmt.executeQuery(sql);
				/* rs 객체로부터 데이터를 추출
				 * 
				 * rs 객체에서 제공하는 메소드를 이용
				 * rs의 next() 메소드는 커서를 다음행으로 이동시킴
				 * 이동된 위치에 행이 존재하면 true, 존재하지 않으면 false를 반환
				 * 
				 * rs.next() 값이 참인 동안 rs으로부터 데이터를 추출
				 * 
				 */
				while(rs.next()) {
				// 커서가 위치한 로우(행)의 각각의 열(컬럼)에서 값을 추출
				// getXXX(컬럼의 위치), getXXX(컬럼이름)을 사용해서 열값을 추출
					int i = rs.getInt(1); // rs.getInt("DEPTNO");
					String s1 = rs.getString(2); // rs.getString("DNAME");
					int j = rs.getInt("college"); // rs.getInt("DEPTNO");
					String s2 = rs.getString("loc"); // rs.getString("DNAME");
					// 인덱스(1) 또는 문자("college")
					
					System.out.println(i+ "\t" +s1+ "\t" +j+ "\t" +s2);
				}				
			
			// 5단계 쿼리문 실행해서 결과 저장
			int result = stmt.executeUpdate(sql);
			
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException se) {
			se.printStackTrace();
		}finally {
			
			try {
				if(rs != null) rs.close(); // 6단계
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
			
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
