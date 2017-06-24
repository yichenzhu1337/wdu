package com.whiteboard;

import java.util.*;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

import com.google.gson.*;

public class HelloWorld extends HttpServlet {

    private String message;

    public void init() throws ServletException {
        // Do required initialization
        message = "Hello World123";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // Set response content type
        String someObject = "{ key1: 'value1', key2: 'value2' }";
        String[] output = {"key1", "value1", "key2", "value"};

        HashMap<String, String> hm = new HashMap<String, String>();
        hm.put("key1", "val1");
        hm.put("key2", "val2");
        hm.put("key3", "val3");

        String json = new Gson().toJson(hm);
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(json);

        // Actual logic goes here.
        //PrintWriter out = response.getWriter();
        //out.println("hi");
    }

    public void destroy() {
        // do nothing.
    }
}