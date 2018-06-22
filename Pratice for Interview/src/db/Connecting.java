package db;

import java.sql.*;  
class Connecting{  
	public static void main(String[] argv) throws Exception {

		System.out.println("-------- MySQL JDBC Connection Testing ------------");

		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println("Where is your MySQL JDBC Driver?");
			e.printStackTrace();
			return;
		}

		System.out.println("MySQL JDBC Driver Registered!");
		Connection connection = null;

		try {
			connection = DriverManager
			.getConnection("jdbc:mysql://localhost:3306/manu","root", "Manu@9966");

		} catch (SQLException e) {
			System.out.println("Connection Failed! Check output console");
			e.printStackTrace();
			return;
		}

		if (connection != null) {
			String query = " insert into emp (id, name, age)"
			        + " values (?, ?, ?)";
			PreparedStatement preparedStmt = connection.prepareStatement(query);
		      preparedStmt.setInt(1, 2);
		      preparedStmt.setString (2, "Manoj");
		      preparedStmt.setInt   (3, 25);
		      preparedStmt.execute();
		      
		      connection.close();
		} else {
			System.out.println("Failed to make connection!");
		}
	  }
	}
