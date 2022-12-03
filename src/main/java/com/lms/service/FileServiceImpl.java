package com.lms.service;

import com.lms.bean.BookDetailParam;
import com.lms.bean.BookInfo;
import com.lms.dao.FileDao;
import com.lms.dao.FileDaoImpl;
import com.lms.entity.Author;
import com.lms.entity.Book;
import com.lms.entity.Category;
import com.lms.entity.User;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileServiceImpl implements FileService {
    FileDao fd = new FileDaoImpl();




    @Override
    public ArrayList<User> getAllUser() {
        return fd.getAllStudent();
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        return fd.getAllBooks();
    }

    @Override
    public ArrayList<BookInfo> getBookInfo() {
        return fd.getBookInfo();
    }

    @Override
    public BookDetailParam getAllParams(int bookid) {
        List<Author> authors=fd.getAllAuthors();
        List<Category> categories=fd.getAllCategorys();
        List<BookInfo> infos=new ArrayList<>();
        infos.add(new BookInfo());
        if(bookid!=-1)
            infos=  fd.getBookInfoById(bookid);
        BookDetailParam res=new BookDetailParam(authors,categories,infos.get(0));
        return res;
    }


//    @Override
//    public ArrayList<User> getTheUser() {
//        return fd.getTheUser();
//    }


//    @Override
//    public User getFileByNameOrId(String v) {
//
//        return fd.getFileByNameOrId(v);
//    }
//
//    @Override
//    public User getFileByNameOrId() {
//        return null;
//    }
//
//    @Override
//    public User getAdmin(String id) {
//        return fd.getAdmin(id);
//    }
//
//    @Override
//    public ArrayList getPersonFile(String studentId) {
//        return fd.getPersonFile(studentId);
//
//    }
}
