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

        Object data = "Some data, can be a String or a Javabean";
        request.setAttribute("data", data);
        request.getRequestDispatcher("/profile.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, java.io.IOException {

    }
}
