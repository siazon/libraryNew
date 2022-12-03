package com.lms.bean;

public class BookInfo {
    private int bookId;
    private String bookName="";
    private int author_id;
    private String author_name;
    private int locationRackId;
    private int categorId;
    private String category;
    private String bookAddedOn;
    private int quantity;

    private String bookNumber;

    public BookInfo() {
    }

    public BookInfo(int bookId, String bookName, int author_id, String author_name, int locationRackId, int categorId, String category, String bookAddedOn, int quantity, String bookNumber) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author_id = author_id;
        this.author_name = author_name;
        this.locationRackId = locationRackId;
        this.categorId = categorId;
        this.category = category;
        this.bookAddedOn = bookAddedOn;
        this.quantity = quantity;
        this.bookNumber = bookNumber;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
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

    public int getLocationRackId() {
        return locationRackId;
    }

    public void setLocationRackId(int locationRackId) {
        this.locationRackId = locationRackId;
    }

    public int getCategorId() {
        return categorId;
    }

    public void setCategorId(int categorId) {
        this.categorId = categorId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getBookAddedOn() {
        return bookAddedOn;
    }

    public void setBookAddedOn(String bookAddedOn) {
        this.bookAddedOn = bookAddedOn;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(String bookNumber) {
        this.bookNumber = bookNumber;
    }
}
