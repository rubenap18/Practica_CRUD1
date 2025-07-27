package com.ruben.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection connection;

    public static Connection getConnection() throws SQLException{
        if (connection == null || connection.isClosed()) {
            connection = DriverManager.getConnection("jdbc:sqlite:/home/rubencin/PracticasJava/practica-crud/src/main/java/com/ruben/crud/base.db");

        }
        return connection;
    }

    public static void closeConnection() throws SQLException{
        if (connection != null && !connection.isClosed()) {
            connection.close();
        }
        
    }
}
