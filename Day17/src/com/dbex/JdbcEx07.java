package com.dbex;

// SELECT
import java.sql.*;
public class JdbcEx07 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		// 동적 쿼리문 작성
		String sql = "SELECT A.NAME, A.PROFNO, A.POSITION, B.DNAME FROM PROFESSOR A, DEPARTMENT B WHERE A.DEPTNO=B.DEPTNO AND A.DEPTNO=?";
		
		try {
			// 데이터베이스 연결
			conn = ConnUtil.getConnection();			
			pstmt = conn.prepareStatement(sql);
						
			// 바인딩 변수 설정
			pstmt.setInt(1, 203);
			
			rs = pstmt.executeQuery(); // SELECT문이라 Query
			
			// 결과 추출
			while(rs.next()) {
				String s1 = rs.getString("name");
				int i = rs.getInt("profno");
				String s2 = rs.getString("position");
				String s3 = rs.getString("dname");
				
				System.out.println(s1+"\t" +i+ "\t" +s2+ "\t" +s3);
			}
				
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(conn != null) conn.close(); // 6단계
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
			
			try {
				if(pstmt != null) pstmt.close(); // 6단계
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
			
			try {
				if(rs != null) rs.close(); // 6단계
			} catch (SQLException ss) {
				ss.printStackTrace();
			}
	
		}

	}

}
