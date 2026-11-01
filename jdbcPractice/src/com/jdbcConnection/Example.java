
package com.jdbcConnection;

import java.sql.*;
import java.util.*;

public class Example {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/user";
        String username = "root";
        String password = "root";

        String query = "INSERT INTO users VALUES (?, ?)";

        try {
            Connection con = DriverManager.getConnection(
                url, username, password
            );

            PreparedStatement ps = con.prepareStatement(query);
            Scanner sc=new Scanner(System.in);
            System.out.println("enter the name");
            String name=sc.nextLine();
            System.out.println("enter the age");
            int age=Integer.parseInt(sc.nextLine());
            ps.setString(1, name);
            ps.setInt(2, age);

            int rows = ps.executeUpdate();

            System.out.println(rows + " row inserted successfully");

            ps.close();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
