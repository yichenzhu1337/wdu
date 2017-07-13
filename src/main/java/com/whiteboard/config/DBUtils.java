package com.whiteboard.config;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class DBUtils {
    public static final String dbName = "mew-java";
    public static final String dbUsername = "root";
    public static final String dbPassword = "";
    public static final String dbHost = "jdbc:mysql://localhost:3306/mew-java";


    public static Connection getConnection(DBTypes dbType) throws SQLException {

        DriverManager.registerDriver(new com.mysql.jdbc.Driver());

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



