package com.training.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class GetConnection {
	static Connection connection; 
	
	public PreparedStatement ps, ps1, ps2; 
	public ResultSet rs, rs1, rs2; 
	
	public static Connection getPostgresConnection () {
		
		// loading the class 
		try {
			Class.forName("org.postgresql.Driver"); 
			connection = DriverManager.getConnection("jdbc:postgres://localhost:5432/sapdb20", "postgres", "kanchan@1"); 
			return connection;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		return null; 
	}
}
