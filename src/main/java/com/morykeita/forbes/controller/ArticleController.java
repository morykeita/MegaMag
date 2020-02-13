package com.morykeita.forbes.controller;


import com.morykeita.forbes.entity.Article;
import com.morykeita.forbes.service.ArticleService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@RestController
@RequestMapping(value = "/api/articles")
public class ArticleController {
    Logger logger = LoggerFactory.getLogger(ArticleController.class);
    @Autowired
    private ArticleService articleService;

    @GetMapping(value = "/",params = {"page","size"})
    public Page<Article> getAll(@RequestParam("page") int page, @RequestParam("size") int size){
        logger.info("request made to getAll. size:" + size + "page " + page );
        Page<Article>  response = articleService.find(page,size);
        logger.info("returning " + response.getSize() );
        return response;
    }

    @GetMapping(value = "/{articleId}")
    public Optional<Article> getById(@PathVariable(value = "articleId",required = true) long articleId){
        return articleService.findById(articleId);
    }
}
