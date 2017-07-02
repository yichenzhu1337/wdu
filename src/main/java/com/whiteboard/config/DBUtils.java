package com.whiteboard.config;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DBUtils {
    public static final String dbName = "mew";
    public static final String dbUsername = "root";
    public static final String dbPassword = "";
    public static final String dbHost = "jdbc:mysql://localhost";

    public static Connection getConnection(DBTypes dbType) throws SQLException {
        switch (dbType) {
            case MYSQL:
                return DriverManager.getConnection(dbHost, dbUsername, dbPassword);
            case ORACLE:
                return DriverManager.getConnection(dbHost, dbUsername, dbPassword);
            default:
                return null;
        }
    }
}



