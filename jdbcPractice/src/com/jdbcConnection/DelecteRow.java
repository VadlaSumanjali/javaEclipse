package com.jdbcConnection;
import java.sql.*;
public class DelecteRow {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/user";
		String user="root";
		String password="root";
		
		String query="delete from users where age=2";
		
		try {
			Connection con=DriverManager.getConnection(url,user,password);
			Statement st=con.createStatement();
			int data=st.executeUpdate(query);
			System.out.println("row deleted "+data);
			con.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
