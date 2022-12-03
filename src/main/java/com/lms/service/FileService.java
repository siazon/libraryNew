package com.lms.service;

import com.lms.bean.BookDetailParam;
import com.lms.bean.BookInfo;
import com.lms.entity.Author;
import com.lms.entity.Book;
import com.lms.entity.Category;
import com.lms.entity.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public interface FileService {
    ArrayList<User> getAllUser();

    ArrayList<Book> getAllBooks();

    ArrayList<BookInfo> getBookInfo();

    BookDetailParam getAllParams(int bookid);


//    ArrayList<User> getTheUser();


//    User getFileByNameOrId(String v);
//
//    User getFileByNameOrId();
//
//    User getAdmin(String id);
//
//    ArrayList getPersonFile(String studentId);
}
