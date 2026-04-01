package com.java.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class EmployeePayrollService {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/payroll";
        String username = "root";
        String password = "jaes";

        try {
            Connection connection =
                    DriverManager.getConnection(jdbcURL, username, password);

            String sql = "update employee_payroll set salary=? where name=?";

            PreparedStatement preparedStatement =
                    connection.prepareStatement(sql);

            preparedStatement.setDouble(1, 3500000);
            preparedStatement.setString(2, "Terisa");

            int rows = preparedStatement.executeUpdate();

            System.out.println("Rows Updated: " + rows);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}