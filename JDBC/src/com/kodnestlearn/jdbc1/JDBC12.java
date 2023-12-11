package com.kodnestlearn.jdbc1;
import java.util.*;
import java.sql.*;


public class JDBC12 {
	
	
	public static void main(String[] args) throws SQLException
	{
		String url="jdbc:mysql://localhost:3306/jdbc-database";
		String username="root";
		String password="kodnest123";
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the id");
		int id=scan.nextInt();
		System.out.println("enter the name");
		String name=scan.nextLine();
		System.out.println("enter the salary");
		int salary=scan.nextInt();
		
		String query ="Insert into Emplpyee values (?,?,?)";
		Connection con=DriverManager.getConnection(url,username,password);
		System.out.println("Connection is established");
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, salary);
		
		pstmt.executeUpdate();
		System.out.println("row is inserted");
		
		
		
		

	}

}
