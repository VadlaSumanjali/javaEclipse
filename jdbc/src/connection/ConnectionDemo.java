package connection;
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionDemo {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/suma";
        String username = "root";
        String password = "root";

        try {
            Connection con = DriverManager.getConnection(
                    url, username, password);

            System.out.println("Connected successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}