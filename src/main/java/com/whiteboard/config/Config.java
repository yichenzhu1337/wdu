package com.whiteboard.config;

import java.sql.Connection;

public class Config {

    public static void main(String args[]) {
        //// DB_UTILS suff
        Connection connection = null;
        try {
            connection = DBUtils.getConnection(DBTypes.MYSQL);
            System.out.println("Db Connection success!");
        }
        catch (Exception e) {
            System.out.println(e.getMessage() + "x");
        }
        finally {
            System.out.println("close DB_UTILS connection");
        }
    }
}
