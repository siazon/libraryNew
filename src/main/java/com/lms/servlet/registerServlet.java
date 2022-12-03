package com.lms.servlet;


import com.lms.entity.User;
import com.lms.service.loginService;
import com.lms.service.loginServiceImpl;
import com.lms.service.registerService;
import com.lms.service.registerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/registerServlet")
public class registerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String u_name_from_html = req.getParameter("username");
        String u_pwd_from_html = req.getParameter("password");

        User u_param = new User();
        u_param.setUser_name(u_name_from_html);
        u_param.setUser_password(u_pwd_from_html);

        registerService l = new registerServiceImpl();
        String user_from_service = l.registerService(u_param);

        req.setAttribute("state", user_from_service);
        req.getRequestDispatcher("register.jsp").forward(req, resp);

    }


    }
