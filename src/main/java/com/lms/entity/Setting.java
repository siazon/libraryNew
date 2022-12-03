package com.lms.entity;

public class Setting {
    private int setting_id;
  private String library_name;
    private String library_address;
    private int library_contact_number;
    private String library_email_address;
    private String library_total_book_issue_day;
    private String library_one_day_fine;
    private String library_issue_total_book_per_user;
    private double library_currency;
    private String library_timezone;

    public Setting() {
    }

    public Setting(int setting_id, String library_name, String library_address, int library_contact_number, String library_email_address, String library_total_book_issue_day, String library_one_day_fine, String library_issue_total_book_per_user, double library_currency, String library_timezone) {
        this.setting_id = setting_id;
        this.library_name = library_name;
        this.library_address = library_address;
        this.library_contact_number = library_contact_number;
        this.library_email_address = library_email_address;
        this.library_total_book_issue_day = library_total_book_issue_day;
        this.library_one_day_fine = library_one_day_fine;
        this.library_issue_total_book_per_user = library_issue_total_book_per_user;
        this.library_currency = library_currency;
        this.library_timezone = library_timezone;
    }

    public int getSetting_id() {
        return setting_id;
    }

    public void setSetting_id(int setting_id) {
        this.setting_id = setting_id;
    }

    public String getLibrary_name() {
        return library_name;
    }

    public void setLibrary_name(String library_name) {
        this.library_name = library_name;
    }

    public String getLibrary_address() {
        return library_address;
    }

    public void setLibrary_address(String library_address) {
        this.library_address = library_address;
    }

    public int getLibrary_contact_number() {
        return library_contact_number;
    }

    public void setLibrary_contact_number(int library_contact_number) {
        this.library_contact_number = library_contact_number;
    }

    public String getLibrary_email_address() {
        return library_email_address;
    }

    public void setLibrary_email_address(String library_email_address) {
        this.library_email_address = library_email_address;
    }

    public String getLibrary_total_book_issue_day() {
        return library_total_book_issue_day;
    }

    public void setLibrary_total_book_issue_day(String library_total_book_issue_day) {
        this.library_total_book_issue_day = library_total_book_issue_day;
    }

    public String getLibrary_one_day_fine() {
        return library_one_day_fine;
    }

    public void setLibrary_one_day_fine(String library_one_day_fine) {
        this.library_one_day_fine = library_one_day_fine;
    }

    public String getLibrary_issue_total_book_per_user() {
        return library_issue_total_book_per_user;
    }

    public void setLibrary_issue_total_book_per_user(String library_issue_total_book_per_user) {
        this.library_issue_total_book_per_user = library_issue_total_book_per_user;
    }

    public double getLibrary_currency() {
        return library_currency;
    }

    public void setLibrary_currency(double library_currency) {
        this.library_currency = library_currency;
    }

    public String getLibrary_timezone() {
        return library_timezone;
    }

    public void setLibrary_timezone(String library_timezone) {
        this.library_timezone = library_timezone;
    }
}
