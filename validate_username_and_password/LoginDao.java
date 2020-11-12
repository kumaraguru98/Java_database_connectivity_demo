package com.login.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
public class LoginDao {  

	String sql ="select * from login where uname=? and pass=?";
	String url = "jdbc:mysql://localhost:3306/logindata";
	String username ="root";
	String password ="enteryourownpasswordhere";
	public boolean Check (String uname,String pass)
	{
		try {
			Class.forName("com.mysql.jdbc.Driver"); //registering driver
			Connection con = DriverManager.getConnection(url,username,password);// establishing connection
			PreparedStatement st = con.prepareStatement(sql); 
			st.setString(1, uname);
			st.setString(2, pass);
            ResultSet rs = st.executeQuery(); //rs holds the result along with table headings
            if (rs.next())  // if there is a record it return true
            {
            	return true;
            	
            }
            
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false ;
	}

}
