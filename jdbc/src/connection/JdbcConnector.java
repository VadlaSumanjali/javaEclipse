package connection;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.Statement;

public class JdbcConnector {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/suma";
        String username = "root";
        String password = "root";
        
        Connection conn=DriverManager.getConnection(url, username, password);
        Statement st=conn.createStatement();
        
        String query="INSERT INTO Employees (EmployeeId,FirstName,LastName,Department,Salary,HireDate)VALUES (109, 'Alice', 'Smith', 'HR', 50000, '2024-06-10');";
        int count =st.executeUpdate(query);
        System.out.println(count+ " records inserted....");
        st.close(); 
        conn.close();
        
		

	}

}
