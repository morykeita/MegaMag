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
public interface ArticleService {

    Page<Article> find(int page, int size);
    Optional<Article> findById(long id);

}
