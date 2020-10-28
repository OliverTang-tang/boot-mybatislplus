/*
package com.example.tangtang.boot.launch;

import com.example.tangtang.boot.launch.controller.ArticleController;
import com.example.tangtang.boot.launch.model.Article;
import com.example.tangtang.boot.launch.service.ArticleService;
import com.fasterxml.jackson.databind.ObjectMapper;
import javafx.beans.binding.When;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import javax.annotation.Resource;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@Slf4j
@AutoConfigureMockMvc
//@SpringBootTest
@WebMvcTest(ArticleController.class)
@ExtendWith(SpringExtension.class)
public class ArticleRestControllerTest3 {
    //mock对象
    @Resource
    private  MockMvc mockMvc;

    @MockBean
    private  ArticleService articleService;



    @Test
    public void saveArticle() throws Exception{

        String article="{\n" +
                "        \"content\": \"12346678\"\n" +
                "}";

        ObjectMapper objectMapper = new ObjectMapper();
        Article articleObj=objectMapper.readValue(article,Article.class);

        //打桩
        //when(articleService.saveArticle(article)).thenReturn("ok");
        when(articleService.saveArticle(articleObj)).thenReturn("ok");

        MvcResult mvcResult = mockMvc.perform(
                MockMvcRequestBuilders
                        .request(HttpMethod.POST, "/rest/articles")
                        //.characterEncoding("UTF-8")
                        //.accept(MediaType.APPLICATION_JSON)
                        //.accept(MediaType.APPLICATION_JSON)
                        //.contentType(MediaType.APPLICATION_JSON)
                        //.characterEncoding("charset=UTF-8")
                        .contentType(MediaType.ALL)
                        //.contentType(MediaType.APPLICATION_JSON)
                        .content(article)
        )
.andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.jsonPath("$.data.author").value("tangtang"))
        .andExpect(MockMvcResultMatchers.jsonPath("$.data.message").value("success"))

        .andDo(print())
        .andReturn();
        log.info(mvcResult.getResponse().getContentAsString());
    }


}
*/
