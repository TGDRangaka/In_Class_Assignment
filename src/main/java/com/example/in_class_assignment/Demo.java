package com.example.in_class_assignment;

import java.io.*;

import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

@WebServlet(name = "Demo", value = "/demo/*")
public class Demo extends HttpServlet {

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String[] split = request.getPathInfo().split("/");
        System.out.println("Last Path : " + split[split.length - 1]);
        System.out.println("Header : " + request.getHeader("Custom-Header"));
    }
}