package com.jdbc;

import java.sql.Statement;

import com.db.db;

public class BP
{

	public static void main(String[] args) 
	{
		
		try
		{
			db.con=db.conn();
			String s1="insert into student values(101,'suresh','banglore')";
			String s2="insert into student values(102,'naresh','chennai')";
			String s3="update student set sid=229 where sid=102";
			
			Statement st=db.con.createStatement();
			st.addBatch(s1);
			st.addBatch(s2);
			st.addBatch(s3);
			
			st.executeBatch();
			
			
			/*Statement st1=db.con.createStatement();
			Statement st2=db.con.createStatement();
			
			st.executeUpdate(s1);
			st1.executeUpdate(s2);
			st2.executeUpdate(s3);
			*/
			System.out.println("sucessfully executed");
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}

	}

}
