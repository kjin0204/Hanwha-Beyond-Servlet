package org.example.cooke;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/cookie")
public class CookieHandlerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");

        System.out.println("이름 = " + firstName);
        System.out.println("성 = " + lastName);

        /* 설명.
         *  쿠키(클라이언트에 저장할 내용)를 생성해서 전달하는 방법
         *  1. 쿠키 인스턴스를 생성한다
         *  2. 해당 쿠키의 만료시간을 설정한다.
         *  3. 응답 헤더에 쿠키를 담는다
         *  4. 응답한다
         * */

        Cookie firstNameCookie = new Cookie("firstName", firstName);
        Cookie lastNameCookie = new Cookie("lastName", lastName);
        firstNameCookie.setMaxAge(60 * 60 * 24); // 초단위 (현재 설정 값은 하루)
        lastNameCookie.setMaxAge(60 * 60 * 12);

        // response 객체에 쿠키 상차
        resp.addCookie(firstNameCookie);
        resp.addCookie(lastNameCookie);

        resp.sendRedirect("redirect");      //302번 응답 코드와 함께 재요청

    }
}
