package com.thoughtfocus.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Laptop {
	private static void getBrandRamStoragebyProcessorType(Connection connection, String processor_type) {
		String query = "SELECT brand,ram FROM laptop WHERE processor_type=?";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;



		try {
		preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, processor_type);
		resultSet = preparedStatement.executeQuery();
		if (resultSet.next()) {
		String brand = resultSet.getString("brand");
		int ram = resultSet.getInt("ram");
		System.out.println("Brand: " + brand);
		System.out.println("Ram Storage Capacity: " + ram);
		} else {
		System.out.println("No result found");
		}



		} catch (SQLException e) {
		e.printStackTrace();
		} finally {
		try {
		if (resultSet != null)
		resultSet.close();
		if (preparedStatement != null)
		preparedStatement.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		}
		}

		private static void readAll(Connection connection) {
		String query = "SELECT * FROM laptop";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;



		try {
		preparedStatement = connection.prepareStatement(query);
		resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
		int id = resultSet.getInt("id");
		String brand = resultSet.getString("brand");
		int ram = resultSet.getInt("ram");
		double price = resultSet.getDouble("price");
		String processor_type = resultSet.getString("processor_type");
		int Storage_Capacity = resultSet.getInt("Storage_Capacity");
		System.out.println(id +"," +brand+","+ram+","+price+","+processor_type+","+Storage_Capacity);
		}
		} catch (SQLException e) {
		e.printStackTrace();
		} finally {
		try {
		if (resultSet != null)
		resultSet.close();
		if (preparedStatement != null)
		preparedStatement.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		}
		}
		private static void readAllPriceGreaterThan6000(Connection connection) {
		String query = "SELECT * FROM laptop WHERE Price > 60000";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;



		try {
		preparedStatement = connection.prepareStatement(query);
		resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
		int id = resultSet.getInt("id");
		String brand = resultSet.getString("brand");
		int ram = resultSet.getInt("ram");
		double price = resultSet.getDouble("price");
		String processor_type = resultSet.getString("processor_type");
		int Storage_Capacity = resultSet.getInt("Storage_Capacity");
		System.out.println("laptops with price higher than 60000 = "+id +"," +brand+","+ram+","+price+","+processor_type+","+Storage_Capacity);
		}
		} catch (SQLException e) {
		e.printStackTrace();
		} finally {
		try {
		if (resultSet != null)
		resultSet.close();
		if (preparedStatement != null)
		preparedStatement.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		}
		}
		private static void readIdAndPricebyStorageCapacityEqualTo500(Connection connection) {
		String query = "SELECT * FROM laptop WHERE Storage_Capacity=500 ";
		PreparedStatement preparedStatement = null;
		ResultSet resultSet = null;



		try {
		preparedStatement = connection.prepareStatement(query);
		resultSet = preparedStatement.executeQuery();
		while (resultSet.next()) {
		int id = resultSet.getInt("id");
		double price = resultSet.getDouble("price");
		System.out.println("Id and Price of laptops with Storage capacity of 500 = "+id +"," +price);
		}
		} catch (SQLException e) {
		e.printStackTrace();
		} finally {
		try {
		if (resultSet != null)
		resultSet.close();
		if (preparedStatement != null)
		preparedStatement.close();
		} catch (SQLException e) {
		e.printStackTrace();
		}
		}
		}

}
