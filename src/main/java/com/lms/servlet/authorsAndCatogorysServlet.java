package com.lms.servlet;

import com.lms.bean.BookDetailParam;
import com.lms.bean.BookInfo;
import com.lms.entity.Author;
import com.lms.entity.Category;
import com.lms.service.FileService;
import com.lms.service.FileServiceImpl;
import com.lms.service.updateService;
import com.lms.service.updateServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet("/authorsAndCatogorys")
public class authorsAndCatogorysServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("service");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String isEdit=req.getParameter("isEdit");
        String bookId=req.getParameter("bookid");
        FileService fs = new FileServiceImpl();
        BookDetailParam arr= fs.getAllParams(Integer.parseInt(bookId));
        req.setAttribute("authors", arr.getAuthorList());
        req.setAttribute("categories", arr.getCategoryList());
        req.setAttribute("bookInfo", arr.getInfo());
        req.setAttribute("isEdit", isEdit);
        req.getRequestDispatcher("updateBook.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


    }

}
