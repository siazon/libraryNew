package com.lms.entity;

import java.util.Set;

public class Book {

    private int bookId;
    private String categoryId;

    private int author_id;
    private String locationRackId;
    private String bookName;
    private String bookIsbnNumber;
    private String bookNoOfCopy;
    private String bookStatus;
    private String bookAddedOn;
    private String bookUpdatedOn;
    private Category category;
    private Set<Author> author;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", categoryId='" + categoryId + '\'' +
                ", author_id='" + author_id + '\'' +
                ", locationRackId='" + locationRackId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", bookIsbnNumber='" + bookIsbnNumber + '\'' +
                ", bookNoOfCopy='" + bookNoOfCopy + '\'' +
                ", bookStatus='" + bookStatus + '\'' +
                ", bookAddedOn='" + bookAddedOn + '\'' +
                ", bookUpdatedOn='" + bookUpdatedOn + '\'' +
                '}';
    }

    public Set<Author> getAuthor() {
        return author;
    }

    public void setAuthor(Set<Author> author) {
        this.author = author;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Book() {
    }

    public Book(int bookId, String categoryId, int author_id, String locationRackId, String bookName, String bookIsbnNumber, String bookNoOfCopy, String bookStatus, String bookAddedOn, String bookUpdatedOn) {
        this.bookId = bookId;
        this.categoryId = categoryId;
        this.author_id = author_id;
        this.locationRackId = locationRackId;
        this.bookName = bookName;
        this.bookIsbnNumber = bookIsbnNumber;
        this.bookNoOfCopy = bookNoOfCopy;
        this.bookStatus = bookStatus;
        this.bookAddedOn = bookAddedOn;
        this.bookUpdatedOn = bookUpdatedOn;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public String getLocationRackId() {
        return locationRackId;
    }

    public void setLocationRackId(String locationRackId) {
        this.locationRackId = locationRackId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookIsbnNumber() {
        return bookIsbnNumber;
    }

    public void setBookIsbnNumber(String bookIsbnNumber) {
        this.bookIsbnNumber = bookIsbnNumber;
    }

    public String getBookNoOfCopy() {
        return bookNoOfCopy;
    }

    public void setBookNoOfCopy(String bookNoOfCopy) {
        this.bookNoOfCopy = bookNoOfCopy;
    }

    public String getBookStatus() {
        return bookStatus;
    }

    public void setBookStatus(String bookStatus) {
        this.bookStatus = bookStatus;
    }

    public String getBookAddedOn() {
        return bookAddedOn;
    }

    public void setBookAddedOn(String bookAddedOn) {
        this.bookAddedOn = bookAddedOn;
    }

    public String getBookUpdatedOn() {
        return bookUpdatedOn;
    }

    public void setBookUpdatedOn(String bookUpdatedOn) {
        this.bookUpdatedOn = bookUpdatedOn;
    }
}
