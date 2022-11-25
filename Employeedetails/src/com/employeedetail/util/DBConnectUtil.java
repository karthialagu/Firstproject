package com.employeedetail.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectUtil {

	public static Connection getDBConnection() throws ClassNotFoundException, SQLException {
	
	Class.forName("com.mysql.jdbc.Driver");
	Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/companydetails","root","root");
	return con;
	
}}
