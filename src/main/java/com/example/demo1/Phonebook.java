package com.example.demo1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Objects;

@WebServlet(name = "Phonebook", value = "/Phonebook")
public class Phonebook extends HttpServlet {

    Database databaseInstance = Database.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //databaseInstance.getInstance().addPerson(new Person("Jonny", "12345"));
        /*         for (Person person : Database.getInstance().getPersonList()) {
            response.getWriter().println(person.getName() + " " + person.getNr());
        } */
        PrintWriter p = response.getWriter();
        p.println("searching for: " + request.getParameter("name"));
        String name = request.getParameter("name");
        for (Person person : Database.getInstance().getPersonList()) {
            if (Objects.equals(person.getName(), name)) {
                p.println(person.getName() + " " + person.getNr());
            }

        }
        //http://localhost:8080/demo1-1.0-SNAPSHOT/Phonebook?name=anna
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }
}