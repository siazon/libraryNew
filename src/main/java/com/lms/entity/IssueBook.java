package com.lms.entity;

public class IssueBook {
    private int issueBookId;
    private int bookId;
    private int userId;
    private String issueDateTime;
    private String ExpectedReturnDate;
    private String returnDateTime;
    private int bookFines;
    private String bookIssueStatus;

    public IssueBook() {
    }

    public IssueBook(int issueBookId, int bookId, int userId, String issueDateTime, String expectedReturnDate, String returnDateTime, int bookFines, String bookIssueStatus) {
        this.issueBookId = issueBookId;
        this.bookId = bookId;
        this.userId = userId;
        this.issueDateTime = issueDateTime;
        ExpectedReturnDate = expectedReturnDate;
        this.returnDateTime = returnDateTime;
        this.bookFines = bookFines;
        this.bookIssueStatus = bookIssueStatus;
    }

    public int getIssueBookId() {
        return issueBookId;
    }

    public void setIssueBookId(int issueBookId) {
        this.issueBookId = issueBookId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getIssueDateTime() {
        return issueDateTime;
    }

    public void setIssueDateTime(String issueDateTime) {
        this.issueDateTime = issueDateTime;
    }

    public String getExpectedReturnDate() {
        return ExpectedReturnDate;
    }

    public void setExpectedReturnDate(String expectedReturnDate) {
        ExpectedReturnDate = expectedReturnDate;
    }

    public String getReturnDateTime() {
        return returnDateTime;
    }

    public void setReturnDateTime(String returnDateTime) {
        this.returnDateTime = returnDateTime;
    }

    public int getBookFines() {
        return bookFines;
    }

    public void setBookFines(int bookFines) {
        this.bookFines = bookFines;
    }

    public String getBookIssueStatus() {
        return bookIssueStatus;
    }

    public void setBookIssueStatus(String bookIssueStatus) {
        this.bookIssueStatus = bookIssueStatus;
    }
}
