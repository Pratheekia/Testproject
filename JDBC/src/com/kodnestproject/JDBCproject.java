package com.kodnestproject;
import java.sql.*;
import java.util.Scanner;

public class JDBCproject {

	
		

			//Method to Insert the row in database
			public static void insert(Statement stmt) throws Exception
			{
				String query ="INSERT INTO EMPLOYEE VALUES(1,'AJAY',35000),(2,'ANKIT',45000),(3,'AMIT',55000)";
				stmt.executeLargeUpdate(query);
				System.out.println("Row is inserted");
			}
			//Method to update the row in the database
			public static void update(Statement stmt) throws Exception
			{
				String query ="UPDATE EMPLOYEE SET SALARY =65000 WHERE ID=3";
				stmt.executeLargeUpdate(query);
				System.out.println("Row is updated");
			}
			//Method to delete the row int the database
			public static void delete(Statement stmt) throws Exception
			{
				String query ="DELETE FROM EMPLOYEE WHERE ID=3"; 
				stmt.executeLargeUpdate(query);
				System.out.println("Row is delete");
			}
			//Method to select the rows in the databse
			public static void select(Statement stmt) throws Exception
			{
				String query ="SELECT * FROM EMPLOYEE";
				ResultSet rs= stmt.executeQuery(query);
				while(rs.next())
				{
					System.out.println(rs.getInt(1)+" "+rs.getNString(2)+" "+rs.getInt(3));
				}
			}
			public static void main(String[] args) throws Exception 
			{
					//Giving values to url ,username,password
					String url ="jdbc:mysql://localhost:3306/company";
					String username ="root";
					String password ="prathamesh@22";
					//Establishing the connection
					Connection con= DriverManager.getConnection(url, username, password);
					System.out.println("Connection is established");
					//Creating the statement using connection
					Statement stmt = con.createStatement();
					Scanner scan=new Scanner(System.in);
					while(true)
					{
						System.out.println("Enter 1 for insertion, 2 for update, 3 for delet , 4 for select and any other number to terminate");
						int choice = scan.nextInt();
						if (choice == 1)
						{
							insert(stmt);
						}
						else if (choice == 2)
						{
							update(stmt);
						}
						else if (choice == 3)
						{
							delete(stmt);
						}
						else if (choice == 4)
						{
							select(stmt);
						}
						else
						{
							System.out.println("Incorrect choice");
							System.exit(0);
						}
				} 
				
			

	}

}
