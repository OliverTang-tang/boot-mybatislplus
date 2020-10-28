package com.example.tangtang.boot.launch.controller;

import com.example.tangtang.boot.launch.AjaxResponse;
import com.example.tangtang.boot.launch.model.ArticleVo;
import com.example.tangtang.boot.launch.service.ArticleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/rest/mybatisplus")
public class ArticleController {

    @Resource
    ArticleService articleJPAService;

    //@RequestMapping(value = "/articles/{id}",method = RequestMethod.GET)
    //@PathVariable("id")
    //@GetMapping("/articlesByid")
    @GetMapping("/articles/{id}")
    public AjaxResponse getArticleById(@PathVariable Long id){
    //lpublic AjaxResponse getArticleById( Long id){
       ArticleVo article=articleJPAService.getArticle(id);

        log.info("article:"+article);

        return AjaxResponse.success(article);
    }

   // @RequestMapping(value = "/articles",method = RequestMethod.POST)
    @PostMapping("/articles")///*,@RequestHeader String aaa*/
    public AjaxResponse saveArticle(@RequestBody ArticleVo article){

        articleJPAService.saveArticle(article);
        log.info("article:"+article);

        return AjaxResponse.success(/*articleService.saveArticle(article)*/);
    }

    @PutMapping("/articles")
    //@RequestMapping(value = "/articles",method = RequestMethod.PUT)
    public AjaxResponse updateArticle(@RequestBody ArticleVo article){
        if(article.getId() == null)
        {
            //TODO 抛出异常
        }
        articleJPAService.updateArticle(article);
        log.info("updateArticle:"+article);

        return AjaxResponse.success();
    }

    @DeleteMapping("/articles")
    //@RequestMapping(value = "/articles/{id}",method = RequestMethod.DELETE)
    public AjaxResponse deleteArticle( Long id){
        articleJPAService.deleteArticle(id);

        log.info("delArticle:"+id);

        return AjaxResponse.success();
    }


    @GetMapping("/articles")
    public AjaxResponse getArticles(){
        List<ArticleVo> articles=articleJPAService.getAll();

        log.info("article:"+articles);

        return AjaxResponse.success(articles);
    }

}
