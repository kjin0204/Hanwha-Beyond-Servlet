package org.example.session.section02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/delete")
public class DeleteSessionDataServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();

        System.out.println("attribute 무효화 전 firstName : " + session.getAttribute("firstName"));
        System.out.println("attribute 무효화 전 lastName : " + session.getAttribute("lastName"));

        // 세션 삭제
        session.invalidate();

        System.out.println("attribute 무효화 후 firstName : " + session.getAttribute("firstName"));
        System.out.println("attribute 무효화 후 lastName : " + session.getAttribute("lastName"));
    }
}
