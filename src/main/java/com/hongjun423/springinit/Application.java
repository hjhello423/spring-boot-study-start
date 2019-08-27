package com.hongjun423.springinit;


//import org.apache.catalina.Context;
//import org.apache.catalina.LifecycleException;
//import org.apache.catalina.startup.Tomcat;
//
//import javax.servlet.ServletException;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.io.PrintWriter;


import org.apache.catalina.Context;
import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Application {
    public static void main(String[] args) throws LifecycleException {
        Tomcat tomcat = new Tomcat();
        tomcat.setPort(8080);

        Context context = tomcat.addContext("/", "/");

        HttpServlet servlet = new HttpServlet() {
            @Override
            protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                PrintWriter writer = resp.getWriter();
                writer.println("하이");
            }
        };

        String servletName = "helloServlet";
        tomcat.addServlet("/", servlet);
        context.addServletMappingDecoded("/hello", servletName);

        tomcat.getConnector();
        tomcat.start();
        tomcat.getServer().await();


    }
}
