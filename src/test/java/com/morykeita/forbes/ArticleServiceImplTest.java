package com.morykeita.forbes;

import com.morykeita.forbes.controller.ArticleController;
import com.morykeita.forbes.controller.ViewController;
import com.morykeita.forbes.entity.Article;
import com.morykeita.forbes.entity.builder.ArticleBuilder;
import com.morykeita.forbes.repository.ArticleRepository;
import com.morykeita.forbes.service.ArticleService;
import com.morykeita.forbes.service.ArticleServiceImpl;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.context.annotation.Bean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ArticleServiceImplTest {

    @Autowired
    private MockMvc mockMvc;
   private ArticleServiceImpl articleService;

    @Before
    public void setUp() {
        this.articleService  = Mockito.mock(ArticleServiceImpl.class);
    }

    @Test
    public void onLoad() throws Exception {
        assertThat(articleService).isNotNull();
    }

    @Test
    public void whenGetArticleShouldNotThrowException() throws Exception {
       Article test =  new Article();
        Mockito.when(articleService.findById(1)).thenReturn(Optional.of(test));
    }

}
