package com.whiteboard.config;

import java.sql.*;
import java.util.Date;

public class Config {

    public static void main(String args[]) throws SQLException {

        String str = "C:/xampp/htdocs/projects/whiteboard-application/src/main/webapp/uploads/authorize.php";

        System.out.println(str.substring(63));

/*        Connection connection = null;
        Statement statement = null;
        ResultSet results = null;
        try {
            connection = DBUtils.getConnection(DBTypes.MYSQL);
            statement = connection.createStatement();
            results = statement.executeQuery("SELECT * FROM courses");

            String sql = "INSERT INTO course_materials (id, course_id, material_url) VALUES(null, ?, ?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, 1);
            preparedStatement.setString(2, "test code");
            preparedStatement.executeUpdate();
            preparedStatement.close();

            while (results.next()) {
                System.out.println(results.getString("title") + " " + results.getString("code"));
            }

            //results.last();
            //System.out.println(results.getRow());
            //System.out.println("Db Connection success!");

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            if (results != null) {
                results.close();
            }
            if (statement != null) {
                statement.close();
            }
            if (connection != null) {
                connection.close();
            }

            System.out.println("close DB_UTILS connection");
        }*/
    }
}
