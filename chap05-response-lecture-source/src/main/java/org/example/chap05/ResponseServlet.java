package org.example.chap05;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/response")
public class ResponseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /* 설명. HttpServeltResopnse를 활용해서 서버에서 페이지 만들어 응답 */
        StringBuilder responseText = new StringBuilder();
        responseText.append("<!DOCTYPE html>\n")
                .append("<html>\n")
                .append("<head>\n")
                .append("</head>\n")
                .append("<body>\n")
                .append("<h1>servlet response</h1>\n")
                .append("</body>\n")
                .append("</html>");

        /* 설명. MIME 타입과 인코딩 방식을 설정해 주어야 한다. JakartaEE이후 생량은 가능하지만
        *       가급적 작성해 주어야 한다. */
//        resp.setContentType("text/html");
//        resp.setCharacterEncoding("UTF-8");
        // 위 아래는 동일
        resp.setContentType("text/html; charset=UTF-8");

        PrintWriter out = resp.getWriter();
        out.println(responseText);
        out.flush();
        out.close();
    }
}
