package com.whiteboard.servlets;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.whiteboard.models.Course;
import com.whiteboard.repositories.CourseRepository;
import com.whiteboard.repositories.CourseRepositoryInterface;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnnouncementServlet extends HttpServlet {

    public AnnouncementServlet() {
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
    }
}