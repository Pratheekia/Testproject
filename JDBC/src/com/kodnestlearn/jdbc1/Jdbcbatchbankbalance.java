package com.kodnestlearn.jdbc1;
import java.sql.*;
import java.util.*;
public class Jdbcbatchbankbalance {

	public static void main(String[] args) throws Exception{
		String url ="jdbc:mysql://localhost:3306/company";
		String username ="root";
		String password ="Pra#8762";
		Connection con= DriverManager.getConnection(url, username, password);
		System.out.println("Connection is established");

	}

}
