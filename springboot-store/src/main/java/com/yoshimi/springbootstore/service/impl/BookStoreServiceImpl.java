package com.yoshimi.springbootstore.service.impl;

import com.yoshimi.springbootstore.dao.BookDao;
import com.yoshimi.springbootstore.domain.Book;
import com.yoshimi.springbootstore.service.BookStoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * book 业务层实现
 */
@Service
public class BookStoreServiceImpl implements BookStoreService {


    @Autowired
    private BookDao bookDao;

    // 模拟数据库，存储 Book 信息
    // 第五章《﻿数据存储》会替换成 H2 数据源存储
    private  static Map<Long,Book> BOOk_DB= new HashMap<>();


    @Override
    public void insert(Book book) {

        book.setId(BOOk_DB.size()+1L);
        BOOk_DB.put(book.getId(),book);
    }

    @Override
    public Book delete(Long id) {
        return BOOk_DB.remove(id);
    }

    @Override
    public Book upDate(Book book) {

        BOOk_DB.put(book.getId(),book);
        return book;
    }

    @Override
    public Book findById(Long id) {
        return BOOk_DB.get(id);
    }

    @Override
    public List<Book> findAll() {
        return new ArrayList<>(BOOk_DB.values());
    }
}
