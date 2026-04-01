package com.java.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class EmployeePayrollService {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/payroll";
        String username = "root";
        String password = "jaes";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            System.out.println("Driver Loaded");

            Connection connection = DriverManager.getConnection(jdbcURL, username, password);

            System.out.println("Connection Established Successfully");

        } catch (ClassNotFoundException e) {

            System.out.println("Driver not found");

        } catch (SQLException e) {

            System.out.println("Connection failed");
            e.printStackTrace();

        }

    }
}