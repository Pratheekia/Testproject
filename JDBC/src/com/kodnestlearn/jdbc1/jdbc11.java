package com.kodnestlearn.jdbc1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class jdbc11 {

	public  void insert () throws Exception {
		{
			String url="jdbc:mysql://localhost:3306/jdbc_database";
			String username="root";
			String password="Pra#8762";
			String query="insert into employee values(1, 'Ajay',35000), (2, 'ankit',45000),(3 , 'Amit',55000)";
			
		   Connection con=DriverManager.getConnection(url,username,password);
			System.out.println("Connection is established ");
			//creating the query using statement
			Statement stmt=con.createStatement();
			//Executing the query using statement
			stmt.executeUpdate(query);
			System.out.println("Data is inserted");
		}
		catch(Exception e)
		{
			e.printStackTrace();
			} 

	}

}
