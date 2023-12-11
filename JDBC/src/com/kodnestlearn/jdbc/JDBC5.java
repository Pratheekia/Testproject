package com.kodnestlearn.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class JDBC5 {
	 try {
		    String url="jdbc:mysql://localhost:3306/jdbc_database";
		    String username="root";
			String password="Pra#8762";
			String query="DELETE STUDENT SET NAME='ANKIT' WHERE ROLL=3";
			//establishing the connection
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established ");
			//creating the query using statement
			Statement stmt=con.createStatement();
			//Executing the query using statement
			stmt.executeUpdate(query);
			System.out.println("Query is executed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			} 
}
