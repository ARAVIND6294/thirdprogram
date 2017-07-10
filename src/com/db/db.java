package com.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class db 
{
	public static Connection con=null;
	
	public static Connection conn()
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/softwares","root","root");
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return con;
	}

}
