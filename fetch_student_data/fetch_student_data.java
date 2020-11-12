package com.JDBC;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class FetchStudentData 
{  

	public static void main (String args[]) throws Exception
	{           
		String query ="select * from register";
		String url = "jdbc:mysql://localhost:3306/studentdata";
		String username ="root";
		String password ="enteryourownpasswordhere";
	    Class.forName("com.mysql.jdbc.Driver"); //registering driver
		Connection con = DriverManager.getConnection(url,username,password);// establishing connection
		Statement st = con.createStatement(); 
		ResultSet rs = st.executeQuery(query); //rs holds the resultant table along with table headings
	    while(rs.next())
	    {
		String registerData= rs.getInt(1)+"	: "+rs.getString(2);//fetching data in form of table
		System.out.println(registerData);	
	    }
	    st.close();
		con.close();
	}
}
