package com.seven.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.Arrays;
import java.util.Optional;

public class BigFattyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("request for BigFattyServlet");
        /*Optional<Cookie[]> optional= Optional.ofNullable(req.getCookies());
        //cookie.forEach(c-> System.out.print(c.getName()+"..."+c.getValue()))
        System.out.println(optional.map(cookies -> Arrays.asList(cookies)).map(cookies -> cookies.iterator()).map(cookieIterator -> cookieIterator.next()).map(cookie -> {
            try {
                return URLDecoder.decode(cookie.getName()+"..."+cookie.getValue(),"UTF-8");
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
            return null;
        }).orElse(""));*/
        //System.out.println(req.getServletContext().getAttribute("new"));
        System.out.println(URLDecoder.decode((String) req.getSession().getAttribute("newnew"),"UTF-8"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        doGet(request,resp);
    }
}
