package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class RS 

{

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/softwares","root","root");
			String s1="select ename,esalary from employee where eid=4";
			Statement st=con.createStatement();
			
			ResultSet rs=st.executeQuery(s1);
			
			while(rs.next())
			{
				System.out.println(rs.getString(1)+ " "+ rs.getString(2));
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
