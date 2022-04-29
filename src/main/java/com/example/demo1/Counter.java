package com.example.demo1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Counter", value = "/Counter")
public class Counter extends HttpServlet {

    int serverCounter = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter p = response.getWriter();
        serverCounter++;
        p.println();
        p.println("<html>");
        p.println("<head>");
        p.println("<title>Servlet Counter</title>");
        p.println("</head>");
        p.println("<body>");
        p.println("<h2>Hello " + serverCounter + "</h2>");
        p.println("</body>");
        p.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}
