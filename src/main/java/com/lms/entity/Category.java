package com.lms.entity;

import java.util.Set;

public class Category {
    private int categoryId;
    private String categoryName;
    private String categoryStatus;
    private String categoryStatusOn;
    private String categoryUpdatedOn;
    private Set<Book> book;

    @Override
    public String toString() {
        return "Category{" +
                "categoryId=" + categoryId +
                ", categoryName='" + categoryName + '\'' +
                ", categoryStatus='" + categoryStatus + '\'' +
                ", categoryStatusOn='" + categoryStatusOn + '\'' +
                ", categoryUpdatedOn='" + categoryUpdatedOn + '\'' +
                ", book=" + book +
                '}';
    }

    public Set<Book> getBook() {
        return book;
    }

    public void setBook(Set<Book> book) {
        this.book = book;
    }

    public Category() {
    }

    public Category(int categoryId, String categoryName, String categoryStatus, String categoryStatusOn, String categoryUpdatedOn) {
        this.categoryId = categoryId;
        this.categoryName = categoryName;
        this.categoryStatus = categoryStatus;
        this.categoryStatusOn = categoryStatusOn;
        this.categoryUpdatedOn = categoryUpdatedOn;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public String getCategoryStatus() {
        return categoryStatus;
    }

    public void setCategoryStatus(String categoryStatus) {
        this.categoryStatus = categoryStatus;
    }

    public String getCategoryStatusOn() {
        return categoryStatusOn;
    }

    public void setCategoryStatusOn(String categoryStatusOn) {
        this.categoryStatusOn = categoryStatusOn;
    }

    public String getCategoryUpdatedOn() {
        return categoryUpdatedOn;
    }

    public void setCategoryUpdatedOn(String categoryUpdatedOn) {
        this.categoryUpdatedOn = categoryUpdatedOn;
    }
}
