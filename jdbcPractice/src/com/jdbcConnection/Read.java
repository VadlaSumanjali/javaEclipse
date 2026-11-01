
package com.jdbcConnection;

import java.sql.*;
import java.util.Scanner;

public class Read {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/user";
        String user = "root";
        String password = "root";

        String query = "SELECT * FROM users WHERE name = ?";

        try {
            Connection con = DriverManager.getConnection(url, user, password);

            PreparedStatement p = con.prepareStatement(query);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter the name:");
            String name = sc.nextLine();

            p.setString(1, name);

            ResultSet res = p.executeQuery();
//            System.out.println(
//                    res.getString(1) + "   " + res.getInt(2)
//                );

            if (res.next()) {
                System.out.println(
                    res.getString(1) + "   " + res.getInt(2)
                );
            } else {
                System.out.println("No user found");
            }
//            System.out.println("lll");
//            if (res.next()) {
//                System.out.println(
//                    res.getString(1) + "   " + res.getInt(2)
//                );
//            } else {
//                System.out.println("No user found");
//            }

            res.close();
            p.close();
            con.close();
            sc.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
