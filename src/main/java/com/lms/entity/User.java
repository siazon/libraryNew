package com.lms.entity;

public class User {

    private int user_id;

  private String user_name;

    private String user_address;

    private String user_profile;

    private String user_email_address;

    private String user_password;

    private String user_verificaton_code;

    private String user_verification_status;

    private String user_unique_id;

    private String user_status;

    private String user_created_on;

    private String user_updated_on;

    public User() {
    }

    public User(int user_id, String user_name, String user_address, String user_profile, String user_email_address, String user_password, String user_verificaton_code, String user_verification_status, String user_unique_id, String user_status, String user_created_on, String user_updated_on) {
        this.user_id = user_id;
        this.user_name = user_name;
        this.user_address = user_address;
        this.user_profile = user_profile;
        this.user_email_address = user_email_address;
        this.user_password = user_password;
        this.user_verificaton_code = user_verificaton_code;
        this.user_verification_status = user_verification_status;
        this.user_unique_id = user_unique_id;
        this.user_status = user_status;
        this.user_created_on = user_created_on;
        this.user_updated_on = user_updated_on;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getUser_address() {
        return user_address;
    }

    public void setUser_address(String user_address) {
        this.user_address = user_address;
    }

    public String getUser_profile() {
        return user_profile;
    }

    public void setUser_profile(String user_profile) {
        this.user_profile = user_profile;
    }

    public String getUser_email_address() {
        return user_email_address;
    }

    public void setUser_email_address(String user_email_address) {
        this.user_email_address = user_email_address;
    }

    public String getUser_password() {
        return user_password;
    }

    public void setUser_password(String user_password) {
        this.user_password = user_password;
    }

    public String getUser_verificaton_code() {
        return user_verificaton_code;
    }

    public void setUser_verificaton_code(String user_verificaton_code) {
        this.user_verificaton_code = user_verificaton_code;
    }

    public String getUser_verification_status() {
        return user_verification_status;
    }

    public void setUser_verification_status(String user_verification_status) {
        this.user_verification_status = user_verification_status;
    }

    public String getUser_unique_id() {
        return user_unique_id;
    }

    public void setUser_unique_id(String user_unique_id) {
        this.user_unique_id = user_unique_id;
    }

    public String getUser_status() {
        return user_status;
    }

    public void setUser_status(String user_status) {
        this.user_status = user_status;
    }

    public String getUser_created_on() {
        return user_created_on;
    }

    public void setUser_created_on(String user_created_on) {
        this.user_created_on = user_created_on;
    }

    public String getUser_updated_on() {
        return user_updated_on;
    }

    public void setUser_updated_on(String user_updated_on) {
        this.user_updated_on = user_updated_on;
    }
}
