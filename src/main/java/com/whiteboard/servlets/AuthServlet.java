package com.whiteboard.servlets;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.whiteboard.models.Course;
import com.whiteboard.repositories.AuthRepository;
import com.whiteboard.repositories.AuthRepositoryInterface;
import com.whiteboard.repositories.CourseRepository;
import com.whiteboard.repositories.CourseRepositoryInterface;
import com.google.gson.JsonNull;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AuthServlet extends HttpServlet {

    public AuthServlet() {
    }

    /**
     * /api/v1/auth/user
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     * @throws ArrayIndexOutOfBoundsException
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ArrayIndexOutOfBoundsException {

        HttpSession session = request.getSession();
        JsonObject value = new JsonObject();

        String[] url = request.getRequestURI().split("\\/");
        String routeName = null;
        if (url.length > 4) {
            routeName = url[4];
        }
        System.out.println(routeName);

        if (session.getAttribute("authId") == null) {
            value.addProperty("permission", "public");
            value.addProperty("user_id", "null");
        }
        else {
            String authId = session.getAttribute("authId").toString();
            value.addProperty("permission", "logged in");
            value.addProperty("user_id", authId);
        }

        response.setContentType("application/json");
        response.setCharacterEncoding("utf-8");
        PrintWriter printer = response.getWriter();
        printer.println(value);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String[] url = request.getRequestURI().split("\\/");
        String routeName = null;
        if (url.length > 4) {
            routeName = url[4];
        }

        HttpSession session = request.getSession();
        JsonObject value = new JsonObject();

        if (routeName != null) {
            if (routeName.equals("login")) {
                session.setAttribute("authId", 10);
                System.out.println(routeName);
            }
            else if(routeName.equals("logout")) {
                session.removeAttribute("authId");
                System.out.println(routeName);
            }
        }
    }
}