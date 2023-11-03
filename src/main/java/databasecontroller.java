package com.example.password;

import java.sql.Connection;
import java.sql.DriverManager;

public class databasecontroller {

    public static void main(String[] args) {
        Connection conn = getConnection();
        // Use the 'conn' object to perform database operations
    }

    public static Connection getConnection() {
        String databaseurl = "jdbc:mysql://localhost:3306/password";
        String username = "root";
        String password = "170703";

        try (Connection conn = DriverManager.getConnection(databaseurl, username, password)) {
            System.out.println("Database connected");
            return conn;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}
