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
			conn.setAutoCommit(true);
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
			PreparedStatement st = con.prepareStatement("SELECT u.id,u.username,u.password,u.name,u.surname,r.id,r.name,r.description FROM user u LEFT JOIN recipe r ON u.id=r.idUser WHERE u.username=?");
			st.setString(1, sf);
			
			ResultSet rs=st.executeQuery();			
			while(rs.next()) {
				
				user=new User();
				user.setId(rs.getInt("u.id"));
				user.setUsername(rs.getString("u.username"));
				user.setPassword(rs.getString("u.password"));
				user.setName(rs.getString("u.name"));
				user.setSurname(rs.getString("u.surname"));
//				
//				Recipe recipe= new Recipe();
//				recipe.setId(rs.getInt("r.id"));
//				recipe.setRecipeName(rs.getString("r.name"));
//				recipe.setDescription(rs.getString("r.description"));
				
//				user.setRecipe(recipe);
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
