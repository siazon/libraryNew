package com.lms.dao;

import com.lms.bean.BookInfo;
import com.lms.entity.Author;
import com.lms.entity.Book;
import com.lms.entity.Category;
import com.lms.entity.User;
import com.lms.util.JDBCHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FileDaoImpl implements FileDao {
    @Override
    public ArrayList<User> getAllStudent() {
        ArrayList<User> arr = new ArrayList<>();
        try {
            Connection jdbcConnection = JDBCHelper.JDBCConnection();
            String sql = "select * from user";
            PreparedStatement crunchifyPrepareStat = jdbcConnection.prepareStatement(sql);
            //crunchifyPrepareStat.setString(1, "");
            ResultSet rs = crunchifyPrepareStat.executeQuery();
            while (rs.next()) {
                User user = new User();
                int uid = rs.getInt("u_id");
                user.setUser_id(uid);
                String name = rs.getString("u_name");
                user.setUser_name(name);
                String pwd = rs.getString("u_pwd");
                user.setUser_password(pwd);
                arr.add(user);
            }
        } catch (Exception e) {
        }
        return arr;
    }

    @Override
    public ArrayList<Book> getAllBooks() {
        ArrayList<Book> arr = new ArrayList<Book>();
        try {
            Connection jdbcConnection = JDBCHelper.JDBCConnection();
            String sql = "select * from lms_book";
            PreparedStatement crunchifyPrepareStat = jdbcConnection.prepareStatement(sql);
            //crunchifyPrepareStat.setString(1, "");
            ResultSet rs = crunchifyPrepareStat.executeQuery();
            while (rs.next()) {
                Book book = new Book();
                int bid = rs.getInt("book_id");
                book.setBookId(bid);
                String name = rs.getString("book_name");
                book.setBookName(name);
                arr.add(book);
            }
        } catch (Exception e) {
        }
        return arr;
    }

    @Override
    public ArrayList<BookInfo> getBookInfo() {
        ArrayList<BookInfo> arr = new ArrayList<BookInfo>();
        try {
            Connection jdbcConnection = JDBCHelper.JDBCConnection();
            String sql = "select book_id,book_name,b.author_id,category_id,book_no_of_copy,author_name,locationRackId," +
                    "category_name,book_added_on from lms_book b inner join lms_author a inner join lms_category c " +
                    "where a.author_id=b.author_id and b.categoryId=c.category_id order by book_id";
            PreparedStatement crunchifyPrepareStat = jdbcConnection.prepareStatement(sql);
            //crunchifyPrepareStat.setString(1, "");
            ResultSet rs = crunchifyPrepareStat.executeQuery();
            while (rs.next()) {
                BookInfo bookInfo = new BookInfo();
                int bid = rs.getInt("book_id");
                bookInfo.setBookId(bid);
                String bookName = rs.getString("book_name");
                bookInfo.setBookName(bookName);
                int quantity=rs.getInt("book_no_of_copy");
                bookInfo.setQuantity(quantity);
                String authorName = rs.getString("author_name");
                bookInfo.setAuthor_name(authorName);
                bookInfo.setAuthor_id(rs.getInt("author_id"));
                int rackId = rs.getInt("locationRackId");
                bookInfo.setLocationRackId(rackId);
                String category = rs.getString("category_name");
                bookInfo.setCategory(category);
                bookInfo.setCategorId(rs.getInt("category_id"));
                String addTime = rs.getString("book_added_on");
                bookInfo.setBookAddedOn(addTime);
                arr.add(bookInfo);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return arr;

    }

    @Override
    public List<Author> getAllAuthors() {
        ArrayList<Author> arr = new ArrayList<>();
        try {
            Connection jdbcConnection = JDBCHelper.JDBCConnection();
            String sql = "select * from lms_author";
            PreparedStatement crunchifyPrepareStat = jdbcConnection.prepareStatement(sql);
            //crunchifyPrepareStat.setString(1, "");
            ResultSet rs = crunchifyPrepareStat.executeQuery();
            while (rs.next()) {
                Author author = new Author();
                int bid = rs.getInt("author_id");
                author.setAuthor_id(bid);
                String name = rs.getString("author_name");
                author.setAuthor_name(name);
                arr.add(author);
            }
        } catch (Exception e) {
        }
        return arr;
    }

    @Override
    public List<Category> getAllCategorys() {
        ArrayList<Category> arr = new ArrayList<Category>();
        try {
            Connection jdbcConnection = JDBCHelper.JDBCConnection();
            String sql = "select * from lms_category";
            PreparedStatement crunchifyPrepareStat = jdbcConnection.prepareStatement(sql);
            //crunchifyPrepareStat.setString(1, "");
            ResultSet rs = crunchifyPrepareStat.executeQuery();
            while (rs.next()) {
                Category category = new Category();
                int bid = rs.getInt("category_id");
                category.setCategoryId(bid);
                String name = rs.getString("category_name");
                category.setCategoryName(name);
                arr.add(category);
            }
        } catch (Exception e) {
        }
        return arr;
    }

    @Override
    public List<BookInfo> getBookInfoById(int bookid) {
        ArrayList<BookInfo> arr = new ArrayList<BookInfo>();
        try {
            Connection jdbcConnection = JDBCHelper.JDBCConnection();
            String sql = "select book_id,book_name,b.author_id,category_id,book_no_of_copy,author_name,locationRackId," +
                    "category_name,book_added_on from lms_book b inner join lms_author a inner join lms_category c " +
                    "where a.author_id=b.author_id and b.categoryId=c.category_id and b.book_id=?";
            PreparedStatement crunchifyPrepareStat = jdbcConnection.prepareStatement(sql);
            crunchifyPrepareStat.setInt(1, bookid);
            ResultSet rs = crunchifyPrepareStat.executeQuery();
            while (rs.next()) {
                BookInfo bookInfo = new BookInfo();
                int bid = rs.getInt("book_id");
                bookInfo.setBookId(bid);
                String bookName = rs.getString("book_name");
                bookInfo.setBookName(bookName);
                int quantity=rs.getInt("book_no_of_copy");
                bookInfo.setQuantity(quantity);
                String authorName = rs.getString("author_name");
                bookInfo.setAuthor_name(authorName);
                bookInfo.setAuthor_id(rs.getInt("author_id"));
                int rackId = rs.getInt("locationRackId");
                bookInfo.setLocationRackId(rackId);
                String category = rs.getString("category_name");
                bookInfo.setCategory(category);
                bookInfo.setCategorId(rs.getInt("category_id"));
                String addTime = rs.getString("book_added_on");
                bookInfo.setBookAddedOn(addTime);
                arr.add(bookInfo);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return arr;
    }

//    @Override
//    public ArrayList<User> getTheUser() {
//        ArrayList<User> arr = new ArrayList<>();
//        try {
//            Connection jdbcConnection = JDBCHelper.JDBCConnection();
//            String sql = "select * from lms_user";
//            PreparedStatement crunchifyPrepareStat = jdbcConnection.prepareStatement(sql);
//            //crunchifyPrepareStat.setString(1, "");
//            ResultSet rs = crunchifyPrepareStat.executeQuery();
//            while (rs.next()) {
//                User theUser = new User();
//                int uid = rs.getInt("user_id");
//                theUser.setUser_id(uid);
//                String name = rs.getString("user_name");
//                theUser.setUser_name(name);
//                arr.add(theUser);
//            }
//        } catch (Exception e) {
//        }
//        return arr;
//    }


//
//    @Override
//    public User getFileByNameOrId(String v) {
//
//        try {
//            Connection jdbcConnection = JDBCHelper.JDBCConnection();
//            String sql = "select * from user where u_name='" + v + "' OR u_id='" + v + "'";
//            PreparedStatement crunchifyPrepareStat = jdbcConnection.prepareStatement(sql);
//            //crunchifyPrepareStat.setString(1, "");
//            ResultSet rs = crunchifyPrepareStat.executeQuery();
//            while (rs.next()) {
//                User user2 = new User();
//                int uid = rs.getInt("u_id");
//                user2.setU_id(uid);
//                String name = rs.getString("u_name");
//                user2.setU_name(name);
//                String pwd = rs.getString("u_pwd");
//                user2.setU_pwd(pwd);
//                String phone = rs.getString("u_phone");
//                user2.setU_phone(phone);
//                return user2;
//
//            }
//        } catch (Exception e) {
//        }
//        return null;
//    }
//
//    @Override
//    public User getAdmin(String id) {
//        try {
//            Connection jdbcConnection = JDBCHelper.JDBCConnection();
//            String sql = "select * from user where u_id='" + id + "'";
//            PreparedStatement crunchifyPrepareStat = jdbcConnection.prepareStatement(sql);
//            //crunchifyPrepareStat.setString(1, "");
//            ResultSet rs = crunchifyPrepareStat.executeQuery();
//            while (rs.next()) {
//                User user2 = new User();
//                int uid = rs.getInt("u_id");
//                user2.setU_id(uid);
//                String name = rs.getString("u_name");
//                user2.setU_name(name);
//                String pwd = rs.getString("u_pwd");
//                user2.setU_pwd(pwd);
//                String phone = rs.getString("u_phone");
//                user2.setU_phone(phone);
//                return user2;
//
//            }
//        } catch (Exception e) {
//        }
//        return null;
//    }
//
//    @Override
//    public ArrayList getPersonFile(String studentId) {
//        ArrayList<Major> arr = new ArrayList<>();
//        try {
//            Connection jdbcConnection = JDBCHelper.JDBCConnection();
//            String sql = "SELECT c_name courseName,c_score score FROM" +
//                    " course a, userchose b WHERE a.c_id=b.c_id AND b.u_id=" + studentId;
//            PreparedStatement crunchifyPrepareStat = jdbcConnection.prepareStatement(sql);
//            //crunchifyPrepareStat.setString(1, "");
//            ResultSet rs = crunchifyPrepareStat.executeQuery();
//            Major m = new Major();
//
//            while (rs.next()) {
//
//                m.setA(rs.getString("courseName"));
//                m.setB(rs.getString("score"));
//                arr.add(m);
//
//
//            }
//        } catch (Exception e) {
//        }
//        return arr;
//    }

}
