package com.java8;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Jdbc {
	
	private static final String username = "root";
	private static final String pass = "root";
	private static final String url = "jdbc:mysql://localhost:3306/file";
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	private static Connection connection = null;
	
	private Jdbc() throws SQLException{
		DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
		connection = DriverManager.getConnection(url,username,pass);
	}
	
	public static void main(String[] args) {
		
		try {
			
			new Jdbc();
			
			System.out.println("Enter name");
			String name = br.readLine();
			
			System.out.println("Enter roll number");
			int roll = Integer.parseInt(br.readLine());
			
			System.out.println("Enter class name");
			
			String cl = br.readLine();
			
			PreparedStatement psmt = connection.prepareStatement("insert into student1(name,roll,class_name) values(?,?,?)");
			psmt.setString(1, name);
			psmt.setInt(2, roll);
			psmt.setString(3, cl);
			
			int row = psmt.executeUpdate();
			
			if(row > 0) 
			  System.out.println("Inserted");	
			else
				System.out.println("somthing went wrong");
			
			
		}catch (Exception e) {
			System.out.println(e);
		}
	}

}
