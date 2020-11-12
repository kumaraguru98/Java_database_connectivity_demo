package com.JDBC;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class FetchStudentName 
{  

	public static void main (String args[]) throws Exception
	{           
		String sql ="select studentname from register where rollnumber = 4";
		String url = "jdbc:mysql://localhost:3306/studentdata";
		String username ="root";
		String password ="enteryourownpasswordhere";
	    Class.forName("com.mysql.jdbc.Driver"); //registering driver
		Connection con = DriverManager.getConnection(url,username,password);// establishing connection
		PreparedStatement st = con.prepareStatement(sql); 
		ResultSet rs = st.executeQuery(); //rs holds the result along with table headings
	    rs.next();
		String name= rs.getString("studentname");//fetching data
		System.out.println(name);	
		st.close();
		con.close();
	}
}

