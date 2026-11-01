
package com.jdbcConnection;

import java.sql.*;
import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/user";
        String username = "root";
        String password = "root";

        String query = "INSERT INTO users VALUES (?, ?)";

        try {
            Connection con = DriverManager.getConnection(
                url, username, password);
            PreparedStatement ps = con.prepareStatement(query);
            Scanner sc = new Scanner(System.in);
            int n = 1;

            while (n < 5) {
                System.out.println("Enter the name:");
                String name = sc.nextLine();

                System.out.println("Enter the age:");
                int age = Integer.parseInt(sc.nextLine());

                ps.setString(1, name);
                ps.setInt(2, age);

                int rows = ps.executeUpdate();

                System.out.println(
                    rows + " row inserted successfully"
                );

                n++;
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("Enter a valid integer for age.");
        }
    }
}
