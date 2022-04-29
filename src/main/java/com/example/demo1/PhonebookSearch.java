package com.example.demo1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet(name = "PhonebookSearch", value = "/PhonebookSearch")
public class PhonebookSearch extends HttpServlet {

    Database databaseInstance = Database.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter p = response.getWriter();

        String serverSideName = request.getParameter("inputName");

        p.println("searching for: " + serverSideName);

        for (Person person : Database.getInstance().getPersonList()) {
            if (Objects.equals(person.getName(), serverSideName)) {
                p.println(person.getName() + " " + person.getNr());
            }
        }
    }
}