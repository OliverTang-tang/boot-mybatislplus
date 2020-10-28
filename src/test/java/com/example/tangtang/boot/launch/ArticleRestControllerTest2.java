/*
package com.example.tangtang.boot.launch;

import com.example.tangtang.boot.launch.controller.ArticleController;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import javax.annotation.Resource;

import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;

@Slf4j
@AutoConfigureMockMvc
@SpringBootTest
@ExtendWith(SpringExtension.class)
public class ArticleRestControllerTest2 {
    //mock对象
    @Resource
    private  MockMvc mockMvc;

   */
/* @BeforeAll
    static void SetUp(){
       *//*
*/
/* Object[] controllers;*//*
*/
/*
        mockMvc = MockMvcBuilders.standaloneSetup(new ArticleController()).build();
    }*//*


    @Test
    public void saveArticle() throws Exception{
        String article="{\n" +
                "        \"content\": \"12346678\"\n" +
                "}";
        MvcResult mvcResult = mockMvc.perform(
                MockMvcRequestBuilders
                        .request(HttpMethod.POST, "/rest/articles")
                        //.characterEncoding("UTF-8")
                        //.accept(MediaType.APPLICATION_JSON)
                        //.accept(MediaType.APPLICATION_JSON)
                        //.contentType(MediaType.APPLICATION_JSON)
                        //.characterEncoding("charset=UTF-8")
                        .contentType(MediaType.APPLICATION_JSON)
                        //.contentType(MediaType.APPLICATION_JSON)
                        .content(article)
        )
        .andExpect(MockMvcResultMatchers.status().isOk())
        //.andExpect(MockMvcResultMatchers.jsonPath("$.data.content").value("tangtang"))
        .andExpect(MockMvcResultMatchers.jsonPath("$.data.message").value("success"))
        .andDo(print())
        .andReturn();
        mvcResult.getResponse().setCharacterEncoding("UTF-8");
        log.info(mvcResult.getResponse().getContentAsString());
    }
    @Test
    public void getArticle() throws Exception{
       */
/* MvcResult mvcResult = *//*
mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/rest/articles/{id}","1")


        ).andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(print()).andReturn();
       // log.info(mvcResult.getResponse().getContentAsString());
    }


}
*/
