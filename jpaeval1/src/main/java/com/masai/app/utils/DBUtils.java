package com.masai.app.utils;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBUtils {
	private final static String URL="jdbc:mysql://localhost:3306/";
	private final static String USERNAME="root";
	private final static String PASSWORD="Vamsi123abc";
	private final static String DRIVER_CLASS="com.mysql.cj.jdbc.Driver";
	
	private static Connection connection = null;
	private static Statement stmt=null;
	private static PreparedStatement pst=null;
	private static ResultSet rs = null;
	
	public static Connection getConnection(String dbname) {
		try {
			Class.forName(DRIVER_CLASS);
			connection = DriverManager.getConnection(URL+dbname,USERNAME,PASSWORD);
		} catch (ClassNotFoundException e) {
			System.out.println("Not found");
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return connection;
	}
	
	public static Statement getStatement() {
		try {
		if(connection != null)
			stmt= connection.createStatement();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return stmt;
	}
	
	public static PreparedStatement getPreparedStatement(String query) {
		try {
			if(connection!=null) {
				pst = connection.prepareStatement(query);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return pst;
	}
	
	public static void closeResources() {
		try {
		if(rs!=null)
			rs.close();
		if(pst!=null)
			pst.close();
		if(stmt!=null)
			stmt.close();
		if(connection!=null)
			connection.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
