package com.learning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {

    private static Connection connection = null;
    private static Statement statement;

    public static void main(String[] args) {
        Connection connection = null;
        try {
            // create a database connection
            connection = DriverManager.getConnection("jdbc:sqlite:C:\\sqlite\\db\\chinook.db");
            statement = connection.createStatement();

            printOptions();

        } catch (SQLException e) {
            // if the error message is "out of memory",
            // it probably means no database file is found
            System.err.println(e.getMessage());
        } finally {
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException e) {
                // connection close failed.
                System.err.println(e.getMessage());
            }
        }
    }

    private static void printOptions() throws SQLException {
        while (true) {
            System.out.println("Please choose an operation below: ");
            System.out.println("(1) Query");
            System.out.println("(2) Insert");
            System.out.println("(3) Update");
            System.out.println("(4) Delete");
            System.out.println("(9) Quit");

            Scanner scanner = new Scanner(System.in);
            int operationInt = scanner.nextInt() - 1;

            if (operationInt == 9) {
                System.out.println();
                System.out.println("Quiting the program.");
                return;
            }

            DbOperation operation = DbOperation.values()[operationInt];

            try {
                operate(operation);
            } catch (Exception e) {
                System.out.println("Please enter a valid options.");
                printOptions();
            }
        }

    }

    private static void operate(DbOperation operation) throws SQLException, InvalidOperationException {
        switch (operation) {
            case QUERY:
                queryEmployees();
                break;
            case INSERT:
                insertEmployee();
                break;
            case UPDATE:
                updateEmployee();
                break;
            case DELETE:
                deleteEmployee();
                break;
            default:
                throw new InvalidOperationException();
        }
    }

    private static void deleteEmployee() throws SQLException {
        statement.executeUpdate("delete from EMPLOYEES where LastName = 'li' and FirstName = 'vincent'");
    }

    private static void updateEmployee() throws SQLException {
        statement.executeUpdate("update EMPLOYEES set Title = 'Manager' where LastName = 'li' and FirstName = 'vincent'");
    }

    private static void insertEmployee() throws SQLException {
        statement.executeUpdate("insert into EMPLOYEES (LastName, FirstName) values('li', 'vincent')");
    }

    private static void queryEmployees() throws SQLException {
        statement.setQueryTimeout(30);  // set timeout to 30 sec.
        ResultSet rs = statement.executeQuery("SELECT * FROM EMPLOYEES;");

        while (rs.next()) {
            int id = rs.getInt("EmployeeId");
            String lastName = rs.getString("LastName");
            String name = rs.getString("FirstName");
            String phone = rs.getString("Phone");
            String email = rs.getString("Email");
            String title = rs.getString("Title");
            String address = rs.getString("Address");


            System.out.println("ID = " + id);
            System.out.println("LASTNAME = " + lastName);
            System.out.println("NAME = " + name);
            System.out.println("TITLE = " + title);
            System.out.println("PHONE = " + phone);
            System.out.println("EMAIL = " + email);
            System.out.println("ADDRESS = " + address);

            System.out.println();
        }
    }
}
