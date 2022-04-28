package com.example.demo1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "DemoServlet", value = "/DemoServlet")
public class DemoServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String age = request.getParameter("age");

        out.println("<html>");
        out.println("<head>");
        out.println("<title>Servlet DemoServlet</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Servlet DemoServlet at " + request.getContextPath() + "</h1>");
        out.println("<h2>Hello " + name + "</h2>");
        out.println("<h2>Your age is " + age + "</h2>");
        out.println("test5");
        out.println("</body>");
        out.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
