package com.jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;

public class RSMETADATA 
{

	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/softwares","root","root");
			
			DatabaseMetaData rd=con.getMetaData();
			
			//System.out.println(rd.getDatabaseProductName());
			//System.out.println(rd.getDatabaseProductVersion());
		     //System.out.println(rd.getDatabaseMajorVersion());
		     //System.out.println(rd.getURL());
		     //System.out.println(rd.getUserName());
		     //System.out.println(rd.getMaxProcedureNameLength());
		     //System.out.println(rd.getDriverName());
			System.out.println(rd.getDatabaseMinorVersion());
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
