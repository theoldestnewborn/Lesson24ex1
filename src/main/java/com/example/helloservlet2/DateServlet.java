package com.example.helloservlet2;

import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "dateServlet", value = "/date-servlet")
public class DateServlet extends HttpServlet {
    private String message;
    String ldt;

    public void init() {
        message = "current time is: ";
        ldt =  LocalDateTime.now().format(DateTimeFormatter.ofPattern("dd MM yyyy, HH-MM"));
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h2>" + ldt + "</h2>");
        out.println("</body></html>");
    }

    public void destroy() {
        System.out.println("Successfully destroyed!");
    }
}