package com.example.tangtang.boot.launch;

import com.example.tangtang.boot.launch.DAO.testdb3.Article;
import com.example.tangtang.boot.launch.DAO.testdb3.ArticleRepository;
import com.example.tangtang.boot.launch.DAO.testdb4.Message;
import com.example.tangtang.boot.launch.DAO.testdb4.MessageRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.util.Date;
import java.util.Optional;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class JPAKeyWorldTest {
    @Resource
    private ArticleRepository articleRepository;

    @Resource
    private MessageRepository messageRepository;

    @Test
    public void jpaMulTest(){
        Optional<Article> article = articleRepository.findById(1L);
    }

    @Test
    public void jpaSaceTest(){
        Article article=Article.builder().id(2L).author("tangtang")
                .content("从青铜到狂铁")
                .createTime(new Date())
                .title("b1")
                .build();
        Message message=Message.builder().name("zimuge").content("halkdfj").build();
    }

}
