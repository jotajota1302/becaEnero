package edu.es.eoi.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataUtilities {
	
	static Connection conexion=null;
	
	public static Connection getConnection() {
		
		if(conexion==null) {
			try {
				conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/gastroDates?serverTimezone=UTC","root","root");			
				conexion.setAutoCommit(true);
			} catch (SQLException e) {
				System.out.println("Could not connect to DB: " + e.getMessage());
			}
		}	
		
		return conexion;
	}

	public static void closeConnection(Connection conn) {
		
		if (conn != null) {
			try {
				conn.close();			
			} catch (SQLException e) {
			}
		}
	}

}
