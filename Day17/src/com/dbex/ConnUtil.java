package com.dbex;

import java.sql.*;
public class ConnUtil {
	
	static {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}	
	}
	/*
	public static Connection getConnection() {
		
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String password = "tiger";
		
		Connection conn = null; // try catch 사용
		try {
			conn = DriverManager.getConnection(url, id, password);
		} catch (SQLException ss) {
			ss.printStackTrace();
		}
		return conn;		
	}
	*/
	
	//try catch 외 방법
	public static Connection getConnection() throws SQLException{
	
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String id = "scott";
		String password = "tiger";
		
		return DriverManager.getConnection(url, id, password);		
	}
	
}
