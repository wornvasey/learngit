package com.yoshimi.springbootstore.domain;

import java.io.Serializable;
import java.util.Date;

public class Book  implements Serializable {

    /**
     * 编号
     */
    private Long id;

    /**
     * 书名
     */
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    /**
     * 作者
     */
    private String writer;

    /**
     *简介
     */
    private String introduction;

    /**
     * 出版日期
     */
   // private Date date;








}
