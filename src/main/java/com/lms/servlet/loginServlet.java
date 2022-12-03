package com.lms.servlet;

import com.lms.entity.Book;
import com.lms.entity.User;
import com.lms.service.FileService;
import com.lms.service.FileServiceImpl;
import com.lms.service.loginService;
import com.lms.service.loginServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
        //get u_name and u_pwd from web
        String u_name_from_html = req.getParameter("username");
        String u_pwd_from_html = req.getParameter("password");
        //Encapsulation
        User u_param = new User();
        u_param.setUser_name(u_name_from_html);
        u_param.setUser_password(u_pwd_from_html);
        //call login service by the user requested from web, and give it to user_from_service
        loginService l = new loginServiceImpl();
        User user_from_Service = l.loginService(u_param);
        //
        if (user_from_Service != null) {
            FileService fs = new FileServiceImpl();
            ArrayList<User> arr = fs.getAllUser();

//            ArrayList<Book> books=fs.getAllBooks();


            req.setAttribute("user", user_from_Service);
            req.setAttribute("arr", arr);
//            req.setAttribute("books",books);
            req.getRequestDispatcher("mainPage.jsp").forward(req, resp);
        } else {
            req.setAttribute("error", "账户和密码不一致");
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }

    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        String u_id_from_html = req.getParameter("user_id");
//        String u_name_from_html = req.getParameter("username");
//
//        User u_param = new User();
//        int u_id = Integer.parseInt(u_id_from_html);
//        u_param.setUser_id(u_id);
//        u_param.setUser_name(u_name_from_html);
//
//        loginService l = new loginServiceImpl();
//        boolean isSuccess = l.updateUserName(u_param);
//
//        if (isSuccess) {
//
//            req.setAttribute("success","用户名更新成功");
//            req.getRequestDispatcher("mainPage.jsp").forward(req, resp);
//        } else {
//            req.setAttribute("error", "更新失败");
//            req.getRequestDispatcher("login.jsp").forward(req, resp);
//        }
//
    }
}
