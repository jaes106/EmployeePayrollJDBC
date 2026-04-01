package com.java.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class EmployeePayrollService {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/payroll";
        String username = "root";
        String password = "jaes";

        try {

            Connection connection =
                    DriverManager.getConnection(jdbcURL, username, password);

            Statement statement = connection.createStatement();

            int rowsAffected =
                    statement.executeUpdate(
                            "update employee_payroll set salary = 3000000 where name = 'Terisa'"
                    );

            System.out.println("Rows Updated: " + rowsAffected);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}