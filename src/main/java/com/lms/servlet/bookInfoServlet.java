package com.lms.servlet;

import com.lms.bean.BookInfo;
import com.lms.entity.Book;
import com.lms.service.FileService;
import com.lms.service.FileServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

@WebServlet("/bookInfoServlet")
public class bookInfoServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);

        FileService fs = new FileServiceImpl();
        ArrayList<BookInfo> arr= fs.getBookInfo();
        req.setAttribute("arr", arr);
        req.getRequestDispatcher("show.jsp").forward(req, resp);

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String u_name_from_html = req.getParameter("bookName");
        String u_pwd_from_html = req.getParameter("book");
    }
}
