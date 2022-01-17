package com.thoughtfocus.jdbc;

import java.sql.SQLException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;

import java.sql.DriverManager;

import org.h2.jdbc.JdbcPreparedStatement;
import org.h2.tools.Server;

public class Practice {

	public static final String createTableQuery = "CREATE TABLE Laptop(" + "id INT Primary Key," + "brand VARCHAR(20),"
			+ "price Number(8,2)," + "ram INT," + "processor_type VARCHAR(20)," + "Storage_Capacity INT" + ")";

	public static String insertQuery = "INSERT INTO laptop VALUES(" + "?," + "?," + "?," + "?," + "?," + "?)";

	
	public static void main(String[] args) {
		Connection connection = getConnection();
		createTable(connection);
		insertRecord(connection);
		
		try {
			Server.startWebServer(connection);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	private static Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection("jdbc:h2:mem:ThoughtFocus", "sa", "sa");
			if (con != null) {
				System.out.println("connection acquired");
			} else {
				System.out.println("Connection not acquired");
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		return con;
	}

	private static void createTable(Connection connection) {
		JdbcPreparedStatement preparedStatement = null;
		try {
			preparedStatement = (JdbcPreparedStatement) connection.prepareStatement(createTableQuery);
			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	private static void insertRecord(Connection connection) {
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(insertQuery);

			preparedStatement.setInt(1, 111);
			preparedStatement.setString(2, "Dell");
			preparedStatement.setDouble(3, 48000);
			preparedStatement.setInt(4, 6);
			preparedStatement.setString(5, "i7");
			preparedStatement.setInt(6, 1000);
			preparedStatement.execute();
			
			preparedStatement = connection.prepareStatement(insertQuery);
			preparedStatement.setInt(1, 125);
			preparedStatement.setString(2, "HP");
			preparedStatement.setDouble(3, 80000);
			preparedStatement.setInt(4, 6);
			preparedStatement.setString(5, "i5");
			preparedStatement.setInt(6,500 );

			preparedStatement.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		private static void readLaptopNameById(Connection connection,int primaryKey) {
			String query = "SELECT brand,price FROM Laptop WHERE id =?";
			preparedStatement pstmt = null;
			ResultSet resultSet = null;
			try {
				pstmt = connection.prepareStatement(query);
			}
		}
		
		
		
		
	}
	

}
