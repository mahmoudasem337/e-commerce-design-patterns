/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author kerol_3obfacr
 */
public class connect {
    // JDBC URL, username and password of MySQL server
    private static final String URL = "jdbc:sqlserver://localhost\\SQLEXPRESS:1433;databaseName=e_commerce_test;encrypt=true;trustServerCertificate=true;";
    private static final String USER = "admin";
    private static final String PASSWORD = "1234";
    
    // JDBC variables for opening and managing connection
    private static Connection connection;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                // Register JDBC driver
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");

                // Open a connection
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Connection established successfully.");
            } catch (ClassNotFoundException | SQLException e) {
                e.printStackTrace();
                System.out.println("Connection failed.");
            }
        }
        return connection;
    }

    public static void closeConnection() {
        if (connection != null) {
            try {
                connection.close();
                System.out.println("Connection closed successfully.");
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Failed to close connection.");
            }
        }
    }

    public static void main(String[] args) {
        // Get connection
        getConnection();

        // Close connection
        closeConnection();
    }
}
