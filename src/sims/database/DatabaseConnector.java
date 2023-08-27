/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sims.database;
import java.sql.*;
/**
 *
 * @author johnc
 */
public class DatabaseConnector {
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
    private static final String CONNECTION_URL = "jdbc:mysql://localhost:3306/student_ims";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = null;
    
    public static Connection getConnection() throws SQLException, ClassNotFoundException  {
        Class.forName(DatabaseConnector.DRIVER_NAME); // required to load the driver to the manager
        return DriverManager.getConnection(DatabaseConnector.CONNECTION_URL,DatabaseConnector.DB_USERNAME,DatabaseConnector.DB_PASSWORD);
    }
}
