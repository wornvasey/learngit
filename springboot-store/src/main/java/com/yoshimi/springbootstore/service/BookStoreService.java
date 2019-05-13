package com.yoshimi.springbootstore.service;

import com.yoshimi.springbootstore.domain.Book;

import java.util.List;

public interface BookStoreService {

    /**
     * 新增Book
     */
    void insert (Book book);

    /**
     * 删除Book
     */
    Book delete (Long id);

    /**
     * 更新Book
     */
    Book upDate(Book book);

    /**
     * 获取Book
     */
    Book findById(Long id);

    /**
     *获取所有book
     */
    List<Book> findAll();

}
