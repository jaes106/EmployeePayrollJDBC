package com.java.bridgelabz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeePayrollService {

    public static void main(String[] args) {

        String jdbcURL = "jdbc:mysql://localhost:3306/payroll";
        String username = "root";
        String password = "jaes";

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection connection =
                    DriverManager.getConnection(jdbcURL, username, password);

            Statement statement = connection.createStatement();

            ResultSet resultSet =
                    statement.executeQuery("select * from employee_payroll");

            while(resultSet.next()) {

                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double salary = resultSet.getDouble("salary");

                System.out.println(id + " " + name + " " + salary);
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
}