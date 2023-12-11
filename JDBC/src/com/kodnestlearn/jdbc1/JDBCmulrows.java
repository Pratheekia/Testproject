package com.kodnestlearn.jdbc1;
import java.sql.*;
import java.util.*;
public class JDBCmulrows {

	public static void main(String[] args) throws Exception{
		String url ="jdbc:mysql://localhost:3306/company";
		String username ="root";
		String password ="Pra#8762";
		
		Connection con= DriverManager.getConnection(url, username, password);
		System.out.println("Connection is established");
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the number rows to be inserted");
		
		int rows=scan.nextInt();
		
		for(int i=1; i<=rows; i++)
		{
	    String query ="Insert into Employee values (?,?,?)";
	    System.out.println("enter the id");
		int id=scan.nextInt();
		System.out.println("enter the name");
		String name=scan.next();
		System.out.println("enter the salary");
		int salary=scan.nextInt();
		
		PreparedStatement pstmt=con.prepareStatement(query);
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		pstmt.setInt(3, salary);
		
		pstmt.executeUpdate();
		System.out.println("row is inserted");
		}
		
		
		}

}
