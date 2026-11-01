package com.jdbcConnection;
import java.sql.*;
public class PsRead {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/user";
		String user="root";
		String password="root";
		
		String query="select * from users where name=?";
		
		try {
			Connection con=DriverManager.getConnection(url,user,password);
			PreparedStatement ps=con.prepareStatement(query);
			ps.setString(1, "ammu");
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				System.out.println(rs.getString(1)+"  "+rs.getInt(2));
			}else {
				System.out.println("not data found");
			}
			con.close();
			ps.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
