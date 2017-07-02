package com.whiteboard.servlets;

import com.whiteboard.config.DBTypes;
import com.whiteboard.config.DBUtils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ProfileServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, java.io.IOException {

        String id = request.getParameter("id");
        String[] url = request.getRequestURI().split("\\/");
        PrintWriter printer = response.getWriter();
        printer.println("id: " + id);
        printer.println("Request URI: " + url[4]);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, java.io.IOException {

    }
}
