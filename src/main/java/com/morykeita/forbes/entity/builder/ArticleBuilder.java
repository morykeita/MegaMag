package com.morykeita.forbes.entity.builder;

import com.morykeita.forbes.entity.Article;


public class ArticleBuilder {

    private String title;
    private String author;
    private String content;
    private String category;

    public Article build(){
        return new Article(title,author,content,category);
    }

    public ArticleBuilder title(String title){
        this.title = title;
        return this;
    }
    public ArticleBuilder content(String content){
        this.content = content;
        return this;
    }

    public ArticleBuilder category(String category){
        this.category = category;
        return this;
    }
    public ArticleBuilder author(String author){
        this.author = author;
        return this;
    }
}
