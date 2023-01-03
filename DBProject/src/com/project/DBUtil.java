package com.project;

import java.sql.*;

public class DBUtil {

	static final String driver="oracle.jdbc.driver.OracleDriver";
	static final String url="jdbc:oracle:thin:@localhost:1521:orcl";
	
	static final String id = "scott";
	static final String password = "tiger";
	
	public static Connection getConnection() throws Exception{
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, id, password);
		return(con);
	}
	
//	public static void main(String[] args)  { // DB연결 확인
//
//		Connection con = null;
//		
//		try {
//			con = DBUtil.getConnection();
//			System.out.println("연결");
//					
//		} catch (Exception e) {
//			e.printStackTrace();
//		}finally {
//			try{
//				if(con != null) con.close();
//			}catch(SQLException ss) {
//				ss.printStackTrace();
//			}
//		}
//
//	}

}
