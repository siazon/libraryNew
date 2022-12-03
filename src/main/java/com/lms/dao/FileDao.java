package com.lms.dao;

import com.lms.bean.BookInfo;
import com.lms.entity.Author;
import com.lms.entity.Book;
import com.lms.entity.Category;
import com.lms.entity.User;

import java.util.ArrayList;
import java.util.List;

public interface FileDao {
    ArrayList<User> getAllStudent();

    ArrayList<Book> getAllBooks();

    ArrayList<BookInfo> getBookInfo();

    List<Author> getAllAuthors();

    List<Category> getAllCategorys();

    List<BookInfo> getBookInfoById(int bookid);


//
//    User getFileByNameOrId(String v);
//
//    User getAdmin(String id);
//
//    ArrayList getPersonFile(String studentId);
}
