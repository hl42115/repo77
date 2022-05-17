package com.seven.servlet;

import javax.servlet.*;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.function.Supplier;

public class LittleFattyServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        this.getServletContext().setAttribute("count", 1);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*req.setCharacterEncoding("UTF-8");
        System.out.println(new String(req.getParameter("username").getBytes("iso-8859-1"), "UTF-8")+"\n");
        System.out.println(req.getParameter("password")+"\n");
        String[] hobbies = req.getParameterValues("hobby");
        for (String hobby:hobbies) {
            System.out.println(hobby+"\n");
        }
        req.getParameterMap().forEach((k,v)->{
            try {
                String value = Arrays.toString(v);
                System.out.println(k +"="+ new String(value.getBytes("iso-8859-1"), "UTF-8"));
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        });*/
        /*System.out.println("request for LittleFattyServlet");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/bigFattyServlet");
        System.out.println("forwarding....");
        requestDispatcher.forward(req,resp);*/
        /*resp.setStatus(302);
        resp.setHeader("Location","bigFattyServlet");*/
        //resp.sendRedirect("bigFattyServlet");
        //resp.setCharacterEncoding("GBK");
        /*resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().write("πÀ¥ÛÊ§‘⁄¿≠ ∫°£°£°£ÌE~~");*/
        //this.getServletContext().setAttribute("new","fatty");
        //System.out.println(this.getServletContext().getRealPath("/img/sexLady.img"));;
        //resp.getWriter().write("file..."+req.getServletContext().getMimeType(req.getParameter("file")));
        /*resp.getWriter().write("<h1> welcome to newnew space </h1>");
        int count = (int) req.getServletContext().getAttribute("count");
        resp.getWriter().write("<dev> there are totally "+count+" person had touched my pangpi</dev>");
        count++;
        req.getServletContext().setAttribute("count", count);*/
        //String encode = URLEncoder.encode("≈÷∆® µƒ≈÷∆®", "UTF-8");
        //resp.addCookie(new Cookie("newnew",encode));
        //req.getSession().setAttribute("newnew",encode);
        resp.getWriter().write(req.getParameter("content"));
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        //request.setCharacterEncoding("UTF-8");
        doGet(request,resp);
    }
}
