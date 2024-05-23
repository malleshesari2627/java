package com.brr.pkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class cls1 {
	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/brr?user=root&password=Welcome1";
//		String username="root";
//		String password="Welcome1";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Driver d= new Driver();
			DriverManager.registerDriver(d);
			

			Connection c= DriverManager.getConnection(url);
			System.out.println("connection successfully");
//			Statement s= c.createStatement();
//			String query="insert into brr.employee values(1,'mallesh','hyd')";
//			String query= "select * from brr.employee";
//			ResultSet r=s.executeQuery(query);
//			while(r.next())
//			{
//				System.out.println(r.getInt(1));
//				System.out.println(r.getString(2));
//				System.out.println(r.getString(3));
//				
//			}
			String query= "insert into employee values(?,?,?)";
			PreparedStatement p=c.prepareStatement(query);
			p.setInt(1, 4);
			p.setString(2,"jeevan");
			p.setString(3, "hyd");
		    p.execute();

			c.close();
		}
	 catch (SQLException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
