package com.lms.service;

import com.lms.bean.BookInfo;

public interface updateService {
    Boolean updateService(BookInfo bi);

    Boolean addService(BookInfo b_param);

    boolean deleteBook(int bookid);
}
