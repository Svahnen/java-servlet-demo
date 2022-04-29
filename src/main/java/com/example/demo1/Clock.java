package com.example.demo1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Clock", value = "/Clock")
public class Clock extends HttpServlet {

    float clock = 0;

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        PrintWriter p = response.getWriter();
        p.println("Hello");
        clock = System.currentTimeMillis();
        p.println(clock);

    }

}