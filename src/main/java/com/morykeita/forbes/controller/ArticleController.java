package com.morykeita.forbes.controller;


import com.morykeita.forbes.entity.Article;
import com.morykeita.forbes.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;


import java.util.Optional;

@RestController
@RequestMapping(value = "/api/articles")
public class ArticleController {

    @Autowired
    private ArticleService articleService;

    @GetMapping(value = "/",params = {"page","size"})
    public Page<Article> getAll(@RequestParam("page") int page, @RequestParam("size") int size){
        return articleService.find(page,size);
    }

    @GetMapping(value = "/{articleId}")
    public Optional<Article> getById(@PathVariable(value = "articleId",required = true) long articleId){
        return articleService.findById(articleId);
    }
}
