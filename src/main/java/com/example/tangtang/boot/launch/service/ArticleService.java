package com.example.tangtang.boot.launch.service;

import com.example.tangtang.boot.launch.model.ArticleVo;

import java.util.List;


public interface ArticleService {

     void saveArticle(ArticleVo article);

    void deleteArticle(Long id);

    void updateArticle(ArticleVo article);

     ArticleVo getArticle(Long id);

     List<ArticleVo> getAll();

}
