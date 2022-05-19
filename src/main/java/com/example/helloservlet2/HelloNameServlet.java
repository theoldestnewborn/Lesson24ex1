package com.example.helloservlet2;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "nameServlet", value = "/hello-name-servlet")
public class HelloNameServlet extends HttpServlet {
    private String message, name;

    public void init() {
        message = "Hello World!";
        name = "It's Aleksey!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("<h2>" + name + "</h2>");
        out.println("</body></html>");
    }

    public void destroy() {
        System.out.println("Successfully destroyed!");
    }
}
