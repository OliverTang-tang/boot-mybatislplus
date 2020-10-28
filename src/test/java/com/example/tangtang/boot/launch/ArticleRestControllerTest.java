/*
package com.example.tangtang.boot.launch;

import com.example.tangtang.boot.launch.controller.ArticleController;
import com.example.tangtang.boot.launch.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.web.client.match.MockRestRequestMatchers;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@Slf4j
public class ArticleRestControllerTest {
    //mock对象
    private static MockMvc mockMvc;

    @BeforeAll
    static void SetUP(){
       */
/* Object[] controllers;*//*

        mockMvc = MockMvcBuilders.standaloneSetup(new ArticleController()).build();
    }

    //设置http header
    @Test
    public void saveArticle() throws Exception{
        String article="{\n" +
                "        \"content\": \"12346678\"\n" +
                "}";
        MvcResult mvcResult = mockMvc.perform(
                MockMvcRequestBuilders
                        .request(HttpMethod.POST, "/rest/articles")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(article)
        )
        .andExpect(MockMvcResultMatchers.status().isOk())
        .andExpect(MockMvcResultMatchers.jsonPath("$.data.content").value("tangtang"))
        .andExpect(MockMvcResultMatchers.jsonPath("$.data.message").value("success"))
        .andDo(print())
        .andReturn();
        log.info(mvcResult.getResponse().getContentAsString());
    }
    @Test
    public void getArticle() throws Exception{
        MvcResult mvcResult = mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/rest/articles/{id}","1")
                        //.characterEncoding("UTF-8")
                        //.accept(MediaType.APPLICATION_JSON)
                        //.accept(MediaType.APPLICATION_JSON)
                        //.contentType(MediaType.APPLICATION_JSON)
                        //.characterEncoding("charset=UTF-8")
                        //.param("id","1")
                        //.contentType(MediaType.APPLICATION_JSON)

        ).andDo(print()).andReturn();

       mvcResult.getResponse().setCharacterEncoding("UTF-8");
        log.info(mvcResult.getResponse().getContentAsString());
    }


}
*/
