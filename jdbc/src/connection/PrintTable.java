package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PrintTable {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/suma";
		String username="root";
		String pasword="root";
		Connection con=DriverManager.getConnection(url, username, pasword);
		Statement st=con.createStatement();
		String query="select * from employees";
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) {
			 System.out.println(
		                rs.getInt("EmployeeId") + " " +
		                rs.getString("FirstName") + " " +
		                rs.getString("LastName") + " " +
		                rs.getString("Department") + " " +
		                rs.getDouble("Salary") + " " +
		                rs.getDate("HireDate")
		            );
		}
		rs.close();
		st.close();
		con.close();

	}

}
