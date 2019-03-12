package com.example.demo.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/hello",filterName = "helloFilter")
public class LoginFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        System.out.println("init");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("doFilter");

//        HttpServletRequest req =(HttpServletRequest)servletRequest;
//        HttpServletResponse resp =(HttpServletResponse)servletResponse;

//        String name = req.getParameter("name");
//        if ("alex".equals((name)))
//        {
            filterChain.doFilter(servletRequest,servletResponse);
//        }else {
//            return;
//        }
    }

    @Override
    public void destroy() {
        System.out.println("destroy2");
    }
}
