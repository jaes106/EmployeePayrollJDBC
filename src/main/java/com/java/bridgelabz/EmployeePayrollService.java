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
            Connection connection =
                    DriverManager.getConnection(jdbcURL, username, password);

            Statement statement = connection.createStatement();

            String query =
                    "select * from employee_payroll where start between '2018-01-01' and date(now())";

            ResultSet resultSet = statement.executeQuery(query);

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