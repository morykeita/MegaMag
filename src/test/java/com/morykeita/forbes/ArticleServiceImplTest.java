package com.morykeita.forbes;

import com.morykeita.forbes.entity.Article;
import com.morykeita.forbes.entity.builder.ArticleBuilder;
import com.morykeita.forbes.repository.ArticleRepository;
import com.morykeita.forbes.service.ArticleService;
import com.morykeita.forbes.service.ArticleServiceImpl;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class ArticleServiceImplTest {

    @TestConfiguration
    static class EmployeeServiceImplTestContextConfiguration {

        @Bean
        public ArticleService articleService() {
            return new ArticleServiceImpl();
        }
    }
    @Autowired
    private ArticleService articleService;
    @MockBean
    private ArticleRepository articleRepository;

    @Before
    public void setUp() {
        Article article = new ArticleBuilder().title("test title").category("Money").content("content").author("William Baldwin").build();
        Mockito.when(articleRepository.save(article))
                .thenReturn(article);
    }
    //TODO write more test cases
}
