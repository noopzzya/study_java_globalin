package com.dbex;

// 동적 쿼리(JSP에서 가장 많이 사용)

/*
 *  PreparedStatement는 SQL의 형태는 동일하나 
 *  조건이나 변수 값이 다른 문자를 바인딩 변수를 사용해서 변수 처리함으로써 
 *  항상 동일한 SQL문을 동일하게 처리 할 수 있다
 *  
 *  바인딩 변수 ( ? )
 *  바인딩 변수는 실제값으로 대체 될 부분에 사용하는 변수이다
 *  
 *  String sql = "insert into department values(?,?,?,?)";
 *  
 *  PreparedStatement pstmt = conn.prepareStatement(sql);
 *  
 *  바인딩 변수의 개수만큼 순서대로 변수와 대체될 값을 지정해준다
 *  pstmt.setInt(1, 203);
 *  pstmt.setString(2, "제어계측공학과");
 *  pstmt.setInt(3, 200);
 *  pstmt.setString(4, "7호관");
 *  
 *  PreparedStatement는 PreparedStatement의 바인딩 변수에 값을 지정해주는 setXXX()메소드를 제공해준다
 *  
 */

// INSERT
import java.sql.*;
public class JdbcEx05 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		// 동적 쿼리문 작성
		String sql = "INSERT INTO PROFESSOR VALUES(?,?,?,?,?,SYSDATE,?,?)";
		
		try {
			// 데이터베이스 연결
			conn = ConnUtil.getConnection();			
			pstmt = conn.prepareStatement(sql);
			
			// 바인딩 변수 설정
			pstmt.setInt(1, 9920);
			pstmt.setString(2, "홍길동");
			pstmt.setString(3, "gildong");
			pstmt.setString(4, "전임교수");
			pstmt.setInt(5, 450);
			pstmt.setInt(6, 40);
			pstmt.setInt(7, 203);
			
			int i = pstmt.executeUpdate();
			System.out.println(i+ "개의 행이 추가 되었습니다.");			
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
		}

	}

}
