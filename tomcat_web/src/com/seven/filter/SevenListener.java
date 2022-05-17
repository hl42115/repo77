package com.seven.filter;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener("/*")
public class SevenListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println(" come in listener...");
        servletContextEvent.getServletContext().setAttribute("newnew","littyFatty");
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println(servletContextEvent.getServletContext().getAttribute("newnew"));
        System.out.println(" listener destroy...");
    }
}
