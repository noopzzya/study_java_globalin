package com.dbex;

// transaction
import java.sql.*;
public class JdbcEx08 {

	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		/*
		 *  transaction : 논리적인 작업단위
		 *  	insert, delete, update 등의 작업들을 
		 *  	하나의 논리적인 작업단위로 묶어서
		 *  	쿼리 실행 시 모든 작업이 정상적으로 처리 된 경우에는 
		 *  	COMMIT을 실행새서 DB에 반영하고,
		 *  	쿼리 실행 중 하나라도 정상처리가 되지 않을 경우 ROLLBACK을 실행해서 작업단윈내의 모든 작업을 취소한다 
		 */
		
		// 동적 쿼리문 작성 (쿼리문 행바꿀 경우 띄어쓰기 안 한 채로 하면 오류)
		String sql1 = "INSERT INTO DEPARTMENT VALUES(?,?,?,?)";
		String sql2 = "UPDATE DEPARTMENT SET DNAME=?, LOC=? WHERE DEPTNO=?";
		
		try {
			// 데이터베이스 연결
			///////////////////////// 하나의 논리적인 작업단위 시작 /////////////////////////
			// 하나의 논리적인 작업 단위 시작
			conn = ConnUtil.getConnection();		
			
			// autoCommit 기능을 비활성화
			conn.setAutoCommit(false);
			
			// ---------------------- 추가작업 (첫 번째 작업) 시작 ----------------------
			pstmt = conn.prepareStatement(sql1);
			pstmt.setInt(1, 255);
			pstmt.setString(2, "핵물리학과");
			pstmt.setInt(3, 200);
			pstmt.setString(4, "9호관");
			pstmt.executeUpdate();
			// ---------------------- 추가작업 (첫 번째 작업) 종료 ----------------------
			
			// ---------------------- 추가작업 (두 번째 작업) 시작 ----------------------
			pstmt = conn.prepareStatement(sql2);
			pstmt.setString(1, "생명공학과");
			pstmt.setString(2, "8호관");
			pstmt.setInt(3, 255);
			pstmt.executeUpdate();
			// ---------------------- 추가작업 (두 번째 작업) 종료 ----------------------
			
			// 쿼리가 정상적으로 실행 된 경우에 db에 반영
			conn.commit();
			System.out.println("db에 정상적으로 반영되었습니다.");
				
		} catch (SQLException e) {
			try {
				conn.rollback();
				System.out.println("db에 비정상적인 작업으로 취소되었습니다.");
			}catch (SQLException ss) {
				ss.printStackTrace();
			}
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
			
			///////////////////////// 하나의 논리적인 작업단위 종료 /////////////////////////
		}

	}

}
