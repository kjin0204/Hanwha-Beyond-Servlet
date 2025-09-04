package org.example.listener.section02;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/session")
public class SessionListenerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("session Listener 확인용 서블릿");

        HttpSession session = req.getSession();
        System.out.println("Servlet에서 session 출력: " + session.getClass().getName());

        session.setAttribute("userName", "honggildong");    //추가
        session.setAttribute("age",20);                     //추가
        session.setAttribute("age",21);                     //수정
        session.removeAttribute("UserName");                     //삭제

        session.setAttribute("user" , new UserDTO("홍길동",10));
        session.removeAttribute("user");
    }
}
