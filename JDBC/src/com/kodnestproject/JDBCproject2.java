package com.kodnestproject;
import java.sql.*;
import java.util.Scanner;
public class JDBCproject2 {

	
		public static void insert(Connection con) throws Exception
		{
			String query ="INSERT INTO EMPLOYEE VALUES(?,?,?)";
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the id");
			int id=scan.nextInt();
			System.out.println("Enter the name");
			String name=scan.next();
			System.out.println("Enter the Salary");
			int salary=scan.nextInt();
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, salary);
			pstmt.executeUpdate();
			System.out.println("Row is inserted");
		}
		//Method to update the row in database
		public static void update(Connection con) throws Exception
		{
			String query ="UPDATE EMPLOYEE SET SALARY =? WHERE ID=?";
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the id");
			int id=scan.nextInt();
			System.out.println("Enter the Salary");
			int salary=scan.nextInt();
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			pstmt.setInt(3, salary);
			pstmt.executeUpdate();
			System.out.println("Row is updated");
		}
		//Method to delete the row in database
		public static void delete(Connection con) throws Exception
		{
			String query ="DELETE FROM EMPLOYEE WHERE ID=?"; 
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the id to be deleted");
			PreparedStatement pstmt = con.prepareStatement(query);
			int id=scan.nextInt();
			pstmt.setInt(1,id);
			pstmt.executeUpdate();
			System.out.println("Row is delete");
		}
		//Method to select the rows in the database
		public static void select(Connection con) throws Exception
		{
			String query ="SELECT * FROM EMPLOYEE wher id=?";
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter the id to be selected");
			int id=scan.nextInt();
			PreparedStatement pstmt = con.prepareStatement(query);
			pstmt.setInt(1, id);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getNString(2)+" "+rs.getInt(3));
			}
		}
		public static void main(String[] args) throws Exception {
			String url ="jdbc:mysql://localhost:3306/company";
			String username ="root";
			String password ="Pra#8762";
			Connection con= DriverManager.getConnection(url, username, password);
			System.out.println("Connection is established");
			Scanner scan=new Scanner(System.in);
			while(true)
			{
				System.out.println("Enter 1 for insertion, 2 for update, 3 for delete , 4 for select and any other number to terminate");
				int choice = scan.nextInt();
				if (choice == 1)
				{
					insert(con);
				}
				else if (choice == 2)
				{
					update(con);
				}
				else if (choice == 3)
				{
					delete(con);
				}
				else if (choice == 4)
				{
					select(con);
				}
				else
				{
					System.out.println("Incorrect choice");
					System.exit(0);
				}
		}

	}

}
