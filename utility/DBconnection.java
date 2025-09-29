package com.utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection

{ 
	public static final String url="jdbc:mysql://localhost:3306/Books";
	public static final String uname="root";
	public static final String password ="root@123" ;
	
	
	public static Connection DBconnectionMethod() throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url, uname, password);
		
		return con;
		
	}
}
