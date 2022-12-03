package com.lms.bean;

import com.lms.entity.Author;
import com.lms.entity.Category;

import java.util.ArrayList;
import java.util.List;

public class BookDetailParam {
    private List<Author> authorList;
    private List<Category> categoryList;
    private BookInfo info;

    public BookDetailParam(List<Author> authorList, List<Category> categoryList, BookInfo info) {
        this.authorList = authorList;
        this.categoryList = categoryList;
        this.info = info;
    }

    public List<Author> getAuthorList() {
        return authorList;
    }

    public void setAuthorList(List<Author> authorList) {
        this.authorList = authorList;
    }

    public List<Category> getCategoryList() {
        return categoryList;
    }

    public void setCategoryList(List<Category> categoryList) {
        this.categoryList = categoryList;
    }

    public BookInfo getInfo() {
        return info;
    }

    public void setInfo(BookInfo info) {
        this.info = info;
    }
}
