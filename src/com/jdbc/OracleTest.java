package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class OracleTest

{

	public static void main(String[] args)
	
	{
		//connecting oracle database
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=DriverManager.getConnection("jdbc:Oracle:thin:@localhost:1521:XE","system","system");
			
			//String s1="create table emp(eid number(20),ename varchar2(30),eaddress varchar2(30))";
			
			String s1="insert into emp values(55,'naveen','banglore')";
			String s2="insert into emp values(56,'satish','chennai')";
			
			Statement st=con.createStatement();
			Statement st1=con.createStatement();
			
			st.executeUpdate(s1);
			st1.executeUpdate(s2);
			
			System.out.println("sucessfully executed");
					
		}
		catch(Exception e)
		{
			e.printStackTrace();
			
		}
		

	}

}
