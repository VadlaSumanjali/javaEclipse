package com.jdbcConnection;
import java.sql.*;
public class StatementEx {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/user";
		String user="root";
		String password="root";
		
		String query="insert into users values ('ammu',1)";
		
		try {
			Connection con=DriverManager.getConnection(url,user,password);
			Statement st=con.createStatement();
			int data=st.executeUpdate(query);
			System.out.println(data+"rows updated");
			con.close();
			
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
