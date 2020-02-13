package com.morykeita.forbes;


import com.morykeita.forbes.controller.ArticleController;
import com.morykeita.forbes.controller.ViewController;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
public class ControllerTest {


    @Autowired
    private MockMvc mockMvc;
    private ArticleController articleController;
    private ViewController viewController;

    @Before
    public void setUp() {
        this.articleController  = Mockito.mock(ArticleController.class);
        this.viewController = Mockito.mock(ViewController.class);
    }

    @Test
    public void onLoad() throws Exception {
        assertThat(articleController).isNotNull();
        assertThat(viewController).isNotNull();
        assertThat(this.mockMvc).isNotNull();
    }

    @Test
    public void getAllThenStatus200() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders
                .get("/api/articles/?page=1&size=10").
                        contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isOk());
    }

    @Test
    public void getAllThenStatus400SizeNotSpecified() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders
                .get("/api/articles/?page=1").
                        contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void getAllThenStatus400PageNotSpecified() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders
                .get("/api/articles/?size=10").
                        contentType(MediaType.APPLICATION_JSON_VALUE)
                .accept(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(status().isBadRequest());
    }

    @Test
    public void shouldReturn200ForDefaultTemplate() throws Exception {
        mockMvc.perform(get("/")).andDo(print()).andExpect(status().isOk())
                .andExpect(status().isOk());
    }

    @Test
    public void shouldReturnTemplate() throws Exception {

        mockMvc.perform(MockMvcRequestBuilders
                .get("/partials/articles").
                        contentType(MediaType.TEXT_HTML)
                .accept(MediaType.ALL))
                .andExpect(status().isOk());
    }

    // TODO add more test case
}