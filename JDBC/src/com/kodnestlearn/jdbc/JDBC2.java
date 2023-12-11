package com.kodnestlearn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

public class JDBC2 {

	public static void main(String[] args) {
		try
		{
			String url="jdbc:mysql://localhost:3306/jdbc_database";
			String username="root";
			String password="Pra#8762";
		    String query="CREATE TABLE STUDENT(ROLL INT, NAME VARCHAR(10))";
			
			
			
			Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established ");
			//creating the query using statement
			Statement stmt=con.createStatement();
			//Executing the query using statement
			stmt.execute(query);
			System.out.println("Query is executed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			}
		}
}

