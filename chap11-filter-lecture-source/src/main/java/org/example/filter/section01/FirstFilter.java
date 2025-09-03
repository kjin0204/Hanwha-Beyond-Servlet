package org.example.filter.section01;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;

import java.io.IOException;

//@WebFilter(filterName = "firstFilter")
@WebFilter(filterName="firstFilter", urlPatterns = "/first/*")
public class FirstFilter implements Filter {

    public FirstFilter() {
        System.out.println("Filter 기본생성자 호출");
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("FirstFilter 인스턴스 생성!");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("FirstFilter의 doFilter()호출 됨...");

        /* 설명. FilterChain에서 제공하는 doFilter를 통해 다음 필터 또는 서블릿으로 진행하라는 의미 */
        chain.doFilter(request,response);
        System.out.println("서블릿 다녀온 이후 client로 응답 전");
    }

    @Override
    public void destroy() {
        System.out.println("FirstFilter destroy()호출");
    }
}
