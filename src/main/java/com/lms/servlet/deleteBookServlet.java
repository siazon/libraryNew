package com.lms.servlet;

import com.lms.bean.BookInfo;
import com.lms.service.updateService;
import com.lms.service.updateServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/deletebook")
public class deleteBookServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("service");
        String bookid = req.getParameter("bookid");



        updateService us = new updateServiceImpl();
        boolean res=us.deleteBook(Integer.parseInt(bookid));

        resp.sendRedirect("/libraryNew/bookInfoServlet");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //this.doGet(req, resp);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String bookid = req.getParameter("bookid");



        updateService us = new updateServiceImpl();
        boolean res=us.deleteBook(Integer.parseInt(bookid));

        resp.sendRedirect("/libraryNew/bookInfoServlet");

    }

}
