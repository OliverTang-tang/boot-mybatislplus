package com.example.tangtang.boot.launch.service;

import com.example.tangtang.boot.launch.model.ArticleVo;

import java.util.List;


public interface ArticleService {

    public void saveArticle(ArticleVo article);

    void deleteArticle(Long id);

    void updateArticle(ArticleVo article);

    public ArticleVo getArticle(Long id);

    public List<ArticleVo> getAll();

}
