package com.jdbcConnection;
import java.sql.*; 
public class ReadData {

	public static void main(String[] args) {
		String url="jdbc:mysql://localhost:3306/user";
		String user="root";
		String password="root";
		
		String query="select * from users";
		
		try {
			Connection con=DriverManager.getConnection(url,user,password);
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			while(rs.next()) {
				System.out.println(rs.getString(1)+"   "+rs.getInt(2));
			}
			con.close();
			st.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		

	}

}
