package com.zyb.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyServlet extends HttpServlet {
    private String message;
    private int count = 0;

    public void init() throws ServletException {
        message = "Hello World";
        System.out.println("init...");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("service...");
        super.service(req,resp);
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        response.setIntHeader("Refresh", 5);
        PrintWriter out = response.getWriter();
        String username = request.getParameter("username");
        out.println("<h1>" + (username!=null ? username : message) + "</h1>");
        out.println("<strong>"+(count++)+"</strong>");
        System.out.println("doGet...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost...");
        PrintWriter out = resp.getWriter();
        out.println("doPost request...");
        resp.sendError(404,"www.baidu.com");
    }

    public void destroy() {
        System.out.println("destroy...");
        super.destroy();
    }
}
