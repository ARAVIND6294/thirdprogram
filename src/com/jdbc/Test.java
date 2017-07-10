package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Test 
{

	public static void main(String[] args) 
	{
      try
      {
    	  //connecting mysql database
    	 Class.forName("com.mysql.jdbc.Driver"); 
    	 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/softwares","root","root");
    	 
    	 //String s1="create table employee(eid int(20),ename varchar(20),esalary varchar(20))";
    	 //String s1="insert into employee values(104,'akhilesh','25000')";
    	 //String s1="update employee set ename='kamalesh' where eid=103";
    	 String s1="delete from employee where ename='akhilesh'";
    	 Statement st=con.createStatement();
    	 
    	 st.executeUpdate(s1);
    	 System.out.println("sucessfully created the table");
    	 
    	 
      }
      catch(Exception e)
      {
    	  e.printStackTrace();
    	  System.out.println("operation failed");
    	  
      }
	}

}
