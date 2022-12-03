package com.lms.servlet;

import com.lms.bean.BookInfo;
import com.lms.service.FileService;
import com.lms.service.FileServiceImpl;
import com.lms.service.updateService;
import com.lms.service.updateServiceImpl;
import com.sun.javaws.IconUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/updatebook")
public class updateServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        System.out.println("service");

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //this.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
String isEdit=req.getParameter("isEdit");
        String bookid = req.getParameter("bookid");
        String bookname = req.getParameter("bookname");
        String authorid = req.getParameter("author");
        String location = req.getParameter("location");
        String quantity = req.getParameter("quantity");
        String categoryid=req.getParameter("category");

        BookInfo b_param = new BookInfo();
        if("Y".equals(isEdit))
            b_param.setBookId(Integer.parseInt(bookid));
        b_param.setBookName(bookname);
        b_param.setAuthor_id(Integer.parseInt(authorid));
        b_param.setCategorId(Integer.parseInt(categoryid));
        b_param.setLocationRackId(Integer.parseInt(location));
        b_param.setQuantity(Integer.parseInt(quantity));

        updateService us = new updateServiceImpl();
        if("Y".equals(isEdit)) {
            Boolean bookInfoFromService = us.updateService(b_param);
        }else{
            Boolean bookInfoFromService = us.addService(b_param);
        }
//        FileService fs = new FileServiceImpl();
//        ArrayList<BookInfo> arr= fs.getBookInfo();
//        req.setAttribute("arr", arr);
        resp.sendRedirect("/libraryNew/bookInfoServlet");
        //req.getRequestDispatcher("/bookInfoServlet").forward(req, resp);

    }

}
