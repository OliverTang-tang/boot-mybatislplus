package com.example.tangtang.boot.launch.service;

import com.example.tangtang.boot.launch.Mapper.ArticleMapper;
import com.example.tangtang.boot.launch.model.Article;
import com.example.tangtang.boot.launch.model.ArticleVo;
import com.example.tangtang.boot.launch.utils.DozerUtils;
import org.dozer.Mapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class ArticleServicempl implements ArticleService {

    @Resource
    ArticleMapper articleMapper;

   @Resource
   private Mapper dozeMapper;

    @Override
    @Transactional
    public void saveArticle(ArticleVo articleVo) {
        Article articlepo = dozeMapper.map(articleVo, Article.class);
        articleMapper.insert(articlepo);
    }

    @Override
    public void deleteArticle(Long id) {
     articleMapper.deleteById(id);
    }

    @Override
    public void updateArticle(ArticleVo article) {
        Article articlePo = dozeMapper.map(article, Article.class);
        articleMapper.updateById(articlePo);//selective 哪一个字段有值就去更新哪一个字段，没有就不更新
    }

    @Override
    public ArticleVo getArticle(Long id) {
        Article article = articleMapper.selectById(id);
        return dozeMapper.map(article,ArticleVo.class);
    }

    @Override
    public List<ArticleVo> getAll() {
        List<Article> articles = articleMapper.selectList(null);//无条件查询表示查询所有
        return DozerUtils.mapList(articles,ArticleVo.class);
    }
}
