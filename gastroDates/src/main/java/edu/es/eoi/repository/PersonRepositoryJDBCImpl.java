package edu.es.eoi.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import edu.es.eoi.entity.Person;
import edu.es.eoi.entity.User;

public class PersonRepositoryJDBCImpl implements PersonRepository{

	public Connection getConnection() {
		
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gastroDates?serverTimezone=UTC","root","root");			
			conn.setAutoCommit(false);
		} catch (SQLException e) {
			System.out.println("Could not connect to DB: " + e.getMessage());
		}
		return conn;
	}

	public void closeConnection(Connection conn) {
		if (conn != null) {
			try {
				conn.close();
			} catch (SQLException e) {
			}
		}
	}
	
	
	@Override
	public void save(Person e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person read(String sf) {
		
		User user = null;
		
		Connection con=getConnection();
		try {
			PreparedStatement st = con.prepareStatement("SELECT id,username,password,name,surname FROM gastrodates.user WHERE username=?");
			st.setString(1, sf);
			
			ResultSet rs=st.executeQuery();			
			while(rs.next()) {
				
				user=new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setName(rs.getString("name"));
				user.setSurname(rs.getString("surname"));
				
			}
		
		} catch (SQLException e) {		
			e.printStackTrace();
		}
		
		return user;
	}

	@Override
	public void delete(Person e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Person update(Person e) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
