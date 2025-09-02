package org.example.parameter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Arrays;

@WebServlet("/querystring")
public class QueryStringServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        System.out.println("name = " + name);

        int age = Integer.parseInt(req.getParameter("age"));
        System.out.println("age = " + age);

        java.sql.Date birthDay = java.sql.Date.valueOf(req.getParameter("birthday"));
        System.out.println("birthDay = " + birthDay);

        String gender = req.getParameter("gender");
        System.out.println("gender = " + gender);

        String national = req.getParameter("national");
        System.out.println("national = " + national);

        String[] hobbies = req.getParameterValues("hobbies");
        System.out.println("hobbies = " + Arrays.toString(hobbies));
    }
}
