package com.thoughtfocus.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.h2.jdbc.JdbcPreparedStatement;
import org.h2.tools.Server;

public class MobileApplication {
	public static final String createTableQuery=
			"CREATE TABLE Application("
			+"id INT Primary Key,"
			+"app_type VARCHAR(25),"
			+"size DOUBLE,"
			+"name VARCHAR(30),"
			+"free BOOLEAN,"
			+"internet_access BOOLEAN,"
			+"no_of_users LONG"
			+")";

			public static String insertQuery = "INSERT INTO application VALUES("
			+"?,"
			+"?,"
			+"?,"
			+"?,"
			+"?,"
			+"?,"
			+"?)";



			 public static String updateQuery =" UPDATE application SET no_of_users=99999 where name ='facebook'";
			//public static String updateQuery =" UPDATE application SET size=50.6 where name ='HIKE'";
			 public static String deleteQuery =" DELETE from application where no_of_users<=1000";
			public static void main(String[] args) {
			Connection connection = getConnection();
			createTable(connection);
			insertRecord(connection);
			updateRecord(connection);
			deleteRecord(connection);
			try {
			Server.startWebServer(connection);
			}catch(SQLException e) {
			e.printStackTrace();
			}

			}



			private static Connection getConnection() {
			Connection con=null;
			try {
			con = DriverManager.getConnection("jdbc:h2:mem:ThoughtFocus", "sa", "sa");
			if(con!=null) {
			System.out.println("connection acquired");
			}
			else {
			System.out.println("Connection not acquired");
			}
			}catch(SQLException e) {
			e.printStackTrace();

			}
			return con;
			}
			private static void createTable(Connection connection ) {
			JdbcPreparedStatement preparedStatement = null;
			try {
			preparedStatement=(JdbcPreparedStatement) connection.prepareStatement(createTableQuery);
			preparedStatement.execute();
			}catch(SQLException e) {
			e.printStackTrace();
			}
			}
			private static void insertRecord(Connection connection ) {
			PreparedStatement preparedStatement = null;
			try {
			preparedStatement=connection.prepareStatement(insertQuery);

			preparedStatement.setInt(1, 1);
			preparedStatement.setString(2, "social");
			preparedStatement.setDouble(3, 30.5);
			preparedStatement.setString(4,"facebook");
			preparedStatement.setBoolean(5,true);
			preparedStatement.setBoolean(6, true);
			preparedStatement.setLong(7, 15845698);
			preparedStatement.execute();
			
			preparedStatement.setInt(1, 2);
			preparedStatement.setString(2, "social");
			preparedStatement.setDouble(3, 25.03);
			preparedStatement.setString(4,"HIKE");
			preparedStatement.setBoolean(5,true);
			preparedStatement.setBoolean(6, true);
			preparedStatement.setLong(7, 874512);
			preparedStatement.execute();
			
			preparedStatement.setInt(1, 3);
			preparedStatement.setString(2, "social");
			preparedStatement.setDouble(3,98.0);
			preparedStatement.setString(4,"YouTube");
			preparedStatement.setBoolean(5,true);
			preparedStatement.setBoolean(6, true);
			preparedStatement.setLong(7,98754125);
			preparedStatement.execute();
			
			preparedStatement.setInt(1, 4);
			preparedStatement.setString(2, "Entertainment");
			preparedStatement.setDouble(3,83.6);
			preparedStatement.setString(4,"AmazonPrime");
			preparedStatement.setBoolean(5,true);
			preparedStatement.setBoolean(6, true);
			preparedStatement.setLong(7,89574);
			preparedStatement.execute();
			
			preparedStatement.setInt(1, 5);
			preparedStatement.setString(2, "Entertainment");
			preparedStatement.setDouble(3,98.56);
			preparedStatement.setString(4,"Ahaa");
			preparedStatement.setBoolean(5,false);
			preparedStatement.setBoolean(6, true);
			preparedStatement.setLong(7,58974);
			preparedStatement.execute();
			
			preparedStatement.setInt(1, 6);
			preparedStatement.setString(2, "OnlineShopping");
			preparedStatement.setDouble(3, 78.05);
			preparedStatement.setString(4,"Flipkart");
			preparedStatement.setBoolean(5,true);
			preparedStatement.setBoolean(6, true);
			preparedStatement.setLong(7, 8712548);
			preparedStatement.execute();
			
			preparedStatement.setInt(1, 7);
			preparedStatement.setString(2, "NEWS");
			preparedStatement.setDouble(3,16.02);
			preparedStatement.setString(4,"LocalNews");
			preparedStatement.setBoolean(5,true);
			preparedStatement.setBoolean(6, true);
			preparedStatement.setLong(7,597);
			preparedStatement.execute();
			
			preparedStatement.setInt(1, 8);
			preparedStatement.setString(2, "social");
			preparedStatement.setDouble(3, 99.02);
			preparedStatement.setString(4,"SNAPCHAT");
			preparedStatement.setBoolean(5,true);
			preparedStatement.setBoolean(6, true);
			preparedStatement.setLong(7, 4582);
			preparedStatement.execute();
			
			preparedStatement.setInt(1, 9);
			preparedStatement.setString(2, "Editing");
			preparedStatement.setDouble(3, 55.02);
			preparedStatement.setString(4,"KineMaster");
			preparedStatement.setBoolean(5,true);
			preparedStatement.setBoolean(6, false);
			preparedStatement.setLong(7,895);
			preparedStatement.execute();
			
			preparedStatement.setInt(1, 10);
			preparedStatement.setString(2, "OnlineBooking");
			preparedStatement.setDouble(3,78.0);
			preparedStatement.setString(4,"BookMyShow");
			preparedStatement.setBoolean(5,true);
			preparedStatement.setBoolean(6, true);
			preparedStatement.setLong(7, 1500);
			preparedStatement.execute();
			}catch(SQLException e) {
			e.printStackTrace();
			}
			}
			 private static void updateRecord(Connection connection ) {
			 JdbcPreparedStatement preparedStatement = null;
			 try {
			 preparedStatement=(JdbcPreparedStatement) connection.prepareStatement(updateQuery);
			 preparedStatement.execute();
			 }catch(SQLException e) {
			 e.printStackTrace();
			 }
			 }
			 
			 
			 private static void deleteRecord(Connection connection ) {
			 JdbcPreparedStatement preparedStatement = null;
			 try {
			 preparedStatement=(JdbcPreparedStatement) connection.prepareStatement(deleteQuery);
			 preparedStatement.execute();
			 }catch(SQLException e) {
			 e.printStackTrace();
			 }
			 }
			 
			

}
