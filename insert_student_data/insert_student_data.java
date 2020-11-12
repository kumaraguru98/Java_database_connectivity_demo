package com.JDBC;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.ResultSet;
public class InsertStudentData 
{  

	public static void main (String args[]) throws Exception
	{           
		String url = "jdbc:mysql://localhost:3306/studentdata";
		String username ="root";
		String password ="enteryourownpasswordhere";
		String query ="select * from register";
		int new_student_rollnumber = 14;
		String new_student_name = "Ahetesham";
		String Query ="insert into register values ("+new_student_rollnumber+",'"+new_student_name+"')";
	    Class.forName("com.mysql.jdbc.Driver"); //registering driver
		Connection con = DriverManager.getConnection(url,username,password);// establishing connection
		Statement st = con.createStatement(); 
		int count=st.executeUpdate(Query);
		System.out.println(count +"row/s affected");
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
