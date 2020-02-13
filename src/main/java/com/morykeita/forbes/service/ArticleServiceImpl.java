package com.morykeita.forbes.service;

import com.morykeita.forbes.entity.Article;
import com.morykeita.forbes.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ArticleServiceImpl implements ArticleService {

    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Page<Article> find(int page, int size) {
        Pageable pageRequest = PageRequest.of(page, size);
        return  articleRepository.findAll(pageRequest);

    }

    @Override
    public Optional<Article> findById(long id) {
        return articleRepository.findById(id);
    }
}
