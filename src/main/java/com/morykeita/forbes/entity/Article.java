package com.morykeita.forbes.entity;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

/*Ideally we should create a category and author class.
the article would have a one to many relationship to author and category classes*/

@Entity
//@Table(name = "article")
public class Article implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    @NotNull
    private String title;
    @NotNull
    //@Column(name = "author")
    private String author;
    @NotNull
    //@Min(value = 5,message = "Article content must have at least 5 characters")
    @Column(columnDefinition="TEXT")
    private String content;
    @NotNull
    private String category;

    public Article(){}

    public Article(String title,String author, String content,String category){
        this.title = title;
        this.author = author;
        this.content = content;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
