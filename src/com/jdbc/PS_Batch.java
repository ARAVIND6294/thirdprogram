package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PS_Batch 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter student values");
		int sid=sc.nextInt();
		String sname=sc.next();
		String saddress=sc.next();
		
		System.out.println("please enter employeee values");
		int eid=sc.nextInt();
		String ename=sc.next();
		String esalary=sc.next();
		
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/softwares","root","root");
			
			//String s1="insert into student values(?,?,?)";
			
			String s1="insert into student(sid,sname,saddress) values(?,?,?)";
			String s2="insert into employee(eid,ename,esalary) values(?,?,?)";
			
			PreparedStatement ps=con.prepareStatement(s1);
			PreparedStatement ps1=con.prepareStatement(s2);
			ps.setInt(1,sid);
			ps.setString(2,sname);
			ps.setString(3,saddress);
			
			ps.executeUpdate();
			
			ps1.setInt(1,eid);
			ps1.setString(2, ename);
			ps1.setString(3,esalary);
			
			ps1.executeUpdate();
			
			
			System.out.println("sucessfully executed");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
