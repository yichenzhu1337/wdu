package com.whiteboard.servlets;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.whiteboard.repositories.CourseRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import com.whiteboard.models.*;
import com.whiteboard.repositories.*;

import java.util.*;

public class CourseServlet extends HttpServlet {

    public CourseServlet() {
    }

    /**
     * Routes:
     *  api/v1/courses
     *  api/v1/courses/{id}
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ArrayIndexOutOfBoundsException {

        String[] url = request.getRequestURI().split("\\/");
        String id = null;
        if (url.length > 4) {
            id = url[4];
        }
        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter printer = response.getWriter();

        Gson gson = new Gson();
        JsonObject value = new JsonObject();

        // get course by id
        if (id != null) {
            CourseRepositoryInterface courseRepository = new CourseRepository();
            Course course = courseRepository.getById((Integer.parseInt(id)));

            /*
            value.addProperty("id", course.getId());
            value.addProperty("title", course.getTitle());
            value.addProperty("code", course.getCode());
            */

            String responseCourse = gson.toJson(course);
            printer.println(responseCourse);
        }
        // get all courses
        else {
            CourseRepository courseRepository = new CourseRepository();
            List<Course> courses = courseRepository.getAll();

            String responseCourses = gson.toJson(courses);

            //value.addProperty("data", mylist);

            printer.println(responseCourses);
        }

        //printer.println(value);
    }

    /**
     * Routes:
     *  api/v1/courses - create
     *  api/v1/courses/{id} - update
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String[] url = request.getRequestURI().split("\\/");
        String id = null;

        //System.out.println(url.length);

        if (url.length > 4) {
            id = url[4];
        }

        String courseTitle = request.getParameter("title");
        String courseCode = request.getParameter("code");

        CourseRepository courseRepository = new CourseRepository();
        Map<String, String> data = new HashMap<>();

        Gson gson = new Gson();
        PrintWriter printer = response.getWriter();

        // create
        if (id == null) {

            if (courseTitle == null || courseCode == null) {
                //throw new Exception("Course title and code are required");
                System.exit(0);
            }

            data.put("title", courseTitle);
            data.put("code", courseCode);
            Course course = courseRepository.create(data);

            String responseCourse = gson.toJson(course);
            printer.println(responseCourse);
        }
        // update
        else {
            data.put("title", courseTitle);
            data.put("code", courseCode);
            Course course = courseRepository.updateById(Integer.parseInt(id) ,data);

            String responseCourse = gson.toJson(course);
            printer.println(responseCourse);
        }
    }
}