package edu.es.eoi.repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import edu.es.eoi.entity.Message;
import edu.es.eoi.entity.User;
import edu.es.eoi.utils.DataUtilities;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MessageRepositoryJDBCImpl implements MessageRepository {

	private static Connection connection;

	private boolean isTest = false;

	public Connection getConnection() {

		if (connection == null) {
			try {
				connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gastroDates?serverTimezone=UTC",
						"root", "root");
				if (this.isTest) {
					connection.setAutoCommit(false);
				} else {
					connection.setAutoCommit(true);
				}

			} catch (SQLException e) {
				System.out.println("Could not connect to DB: " + e.getMessage());
			}

		} else
			try {
				if (connection.isClosed()) {
					connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/gastroDates?serverTimezone=UTC",
							"root", "root");
				}
			} catch (SQLException e) {			
				e.printStackTrace();
			}
		
		return connection;

	}

	@Override
	public void save(Message e) {

		connection = getConnection();

		try {
			PreparedStatement st = connection.prepareStatement(
					"INSERT INTO gastrodates.message (origin,destination,message,datetime,readed) VALUES (?,?,?,?,?)");
			st.setInt(1, e.getOrigin().getId());
			st.setInt(2, e.getDestination().getId());
			st.setString(3, e.getMessage());
			java.util.Date date = Calendar.getInstance().getTime();
			Date dateSql = new Date(date.getTime());
			st.setDate(4, dateSql);
			st.setBoolean(5, e.isReaded());

			st.executeUpdate();

		} catch (SQLException e1) {
			e1.printStackTrace();

		} finally {
			DataUtilities.closeConnection(connection);
		}

	}

	@Override
	public List<Message> getMessagesBy(String username, Boolean read) {

		List<Message> messages = null;

		connection = getConnection();

		try {

			PreparedStatement st = connection.prepareStatement(
					"SELECT m.id,o.name,d.name,m.datetime,m.message,m.readed FROM message m "
							+ "JOIN user o ON m.origin=o.id " + "JOIN user d ON m.destination=d.id "
							+ "WHERE d.name=? AND m.readed=?");

			st.setString(1, username);
			st.setBoolean(2, read);
			
			ResultSet rs = st.executeQuery();	

			messages = new ArrayList<Message>();

			while (rs.next()) {

				Message message = new Message();
				message.setId(rs.getInt("m.id"));
				message.setMessage(rs.getString("m.message"));
				User origin = new User();
				origin.setName(rs.getString("o.name"));
				User destination = new User();
				destination.setName(rs.getString("d.name"));
				message.setOrigin(origin);
				message.setDestination(destination);
				message.setDate(rs.getDate("m.datetime"));
				message.setReaded(rs.getBoolean("m.readed"));

				messages.add(message);
			}

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			DataUtilities.closeConnection(connection);
		}

		return messages;

	}

	@Override
	public int update(Message e) {
		
		int response = 0;
		connection=getConnection();
		
		try {
			PreparedStatement st=connection.prepareStatement("UPDATE message SET readed = ?,message=? where id=?");
			
			st.setBoolean(1, e.isReaded());
			st.setString(2, e.getMessage());
			st.setInt(3, e.getId());
			
			 response=st.executeUpdate();
			
		} catch (SQLException e1) {			
			e1.printStackTrace();
		}finally {
			DataUtilities.closeConnection(connection);
		}		
		
		return response;
		
	}

	@Override
	public int delete(Message e) {
	
		int result = 0;
		connection=getConnection();
		
		try {
			PreparedStatement st=connection.prepareStatement("DELETE FROM message WHERE id = ?");		
			st.setInt(1, e.getId());
			
			result=st.executeUpdate();
			
		} catch (SQLException e1) {	
			e1.printStackTrace();
		}
		
		return result;
	}

	
}
