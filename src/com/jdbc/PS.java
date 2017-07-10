package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PS 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter the values");
		int sid=sc.nextInt();
		String sname=sc.next();
		String saddress=sc.next();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/softwares","root","root");
			
			//String s1="insert into student values(?,?,?)";
			  String s1="insert into student(sid,sname,saddress) values(?,?,?)";
			PreparedStatement ps=con.prepareStatement(s1);
			ps.setInt(1, sid);
			ps.setString(2, sname);
			ps.setString(3,saddress);
			
			ps.executeUpdate();
			
			
		    
					
			System.out.println("sucessfully executed");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
