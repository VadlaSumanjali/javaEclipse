package com.jdbcConnection;
import java.sql.*; 
public class PreparedStatemtsEx {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/user";
		String user="root";
		String password="root";
		
		String query="update users set name=?  where name=?";
		
		
		try {
			Connection con=DriverManager.getConnection(url,user,password);
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, "sumanjali");
			ps.setString(2, "suma");
			int data=ps.executeUpdate();
			System.out.println(data);
			con.close();
			ps.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
