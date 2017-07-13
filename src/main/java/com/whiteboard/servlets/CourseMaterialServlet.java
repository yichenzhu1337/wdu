package com.whiteboard.servlets;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.whiteboard.config.DBTypes;
import com.whiteboard.config.DBUtils;
import com.whiteboard.models.Course;
import com.whiteboard.repositories.CourseRepository;
import com.whiteboard.repositories.CourseRepositoryInterface;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.*;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CourseMaterialServlet extends HttpServlet {

    public CourseMaterialServlet() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Connection connection = null;
        Statement statement = null;
        ResultSet results = null;
        try {
            connection = DBUtils.getConnection(DBTypes.MYSQL);
            statement = connection.createStatement();
            results = statement.executeQuery("SELECT * FROM course_materials");

            JsonObject value = new JsonObject();

            JsonArray list = new JsonArray();
            while (results.next()) {


                list.add(results.getString("material_url"));
            }

            value.add("data", list);

            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            PrintWriter printer = response.getWriter();
            printer.println(value);

            connection.close();
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("close DB_UTILS connection");
        }

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        DiskFileItemFactory factory = new DiskFileItemFactory();

        try {
            ServletFileUpload upload = new ServletFileUpload(factory);
            List<FileItem> items = upload.parseRequest(request);

            for (FileItem item: items) {
                String path = "C:/xampp/htdocs/projects/whiteboard-application/src/main/webapp/uploads/" + item.getName();
                item.write(new File(path));

                Connection connection = null;
                try {
                    connection = DBUtils.getConnection(DBTypes.MYSQL);
                    String sql = "INSERT INTO course_materials (id, course_id, material_url) VALUES(null, ?, ?)";
                    PreparedStatement preparedStatement = connection.prepareStatement(sql);
                    preparedStatement.setInt(1, 1);
                    preparedStatement.setString(2, path.substring(63));
                    preparedStatement.executeUpdate();
                    preparedStatement.close();
                }
                catch (Exception e) {
                    System.out.println(e.getMessage());
                }
                finally {
                    if (connection != null) {
                        connection.close();
                    }
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}