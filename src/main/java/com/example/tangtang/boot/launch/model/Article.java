package com.example.tangtang.boot.launch.model;

import lombok.Data;

import java.util.Date;

@Data
public class Article {

    private Long id;
    private String author;
    private String content;
    private String title;
    private Date createtime;


}
