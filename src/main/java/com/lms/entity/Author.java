package com.lms.entity;

import java.util.Set;

public class Author {
    private int author_id;
    private String author_name;
    private String author_status;
    private String author_created_on;
    private String author_updated_on;
    private Set<Book> book;

    public Set<Book> getBook() {
        return book;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }

    @Override
    public String toString() {
        return "Author{" +
                "author_id=" + author_id +
                ", author_name='" + author_name + '\'' +
                ", author_status='" + author_status + '\'' +
                ", author_created_on='" + author_created_on + '\'' +
                ", author_updated_on='" + author_updated_on + '\'' +
                ", book=" + book +
                '}';
    }

    public Author(int author_id, String author_name, String author_status, String author_created_on, String author_updated_on) {
        this.author_id = author_id;
        this.author_name = author_name;
        this.author_status = author_status;
        this.author_created_on = author_created_on;
        this.author_updated_on = author_updated_on;
    }

    public Author() {
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public String getAuthor_status() {
        return author_status;
    }

    public void setAuthor_status(String author_status) {
        this.author_status = author_status;
    }

    public String getAuthor_created_on() {
        return author_created_on;
    }

    public void setAuthor_created_on(String author_created_on) {
        this.author_created_on = author_created_on;
    }

    public String getAuthor_updated_on() {
        return author_updated_on;
    }

    public void setAuthor_updated_on(String author_updated_on) {
        this.author_updated_on = author_updated_on;
    }


}

