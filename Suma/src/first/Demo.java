package first;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/test";
        String username = "root";
        String password = "root";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connected Successfully");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
