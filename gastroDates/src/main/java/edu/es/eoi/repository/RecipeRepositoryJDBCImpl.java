package edu.es.eoi.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Collection;

import edu.es.eoi.entity.Recipe;

public class RecipeRepositoryJDBCImpl implements RecipeRepository {

	public Connection getConnection() {

		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gastroDates?serverTimezone=UTC", "root",
					"root");
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
	public void save(Recipe e) {
		// TODO Auto-generated method stub

	}

	@Override
	public Recipe read(String sf) {
		Recipe recipe = null;

		Connection con = getConnection();
		try {
			PreparedStatement st = con
					.prepareStatement("SELECT id,name,description FROM gastrodates.recipe WHERE name=?");
			st.setString(1, sf);

			ResultSet rs = st.executeQuery();
			while (rs.next()) {

				recipe = new Recipe();
				recipe.setId(rs.getInt("id"));
				recipe.setRecipeName(rs.getString("name"));
				recipe.setDescription(rs.getString("description"));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return recipe;
	}

	@Override
	public void delete(Recipe e) {
		// TODO Auto-generated method stub

	}

	@Override
	public Recipe update(Recipe e) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Recipe> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Recipe> readRecipesByUser(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
