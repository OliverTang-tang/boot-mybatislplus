package com.example.tangtang.boot.launch.DAO.testdb3;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity//代表实体
@Table(name = "article")//与实体类对应的表
public class Article {

    //@JsonIgnore
    //@JsonProperty(value = "学号")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键
    private Long id;

    @Column(nullable = false,length = 32)
    private String author;

    @Column(nullable = false,unique = true,length = 32)
    private String title;

    @Column(length = 512)
    private  String content;

    //@JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date createTime;


    //查询语句时要加上无参构造方法
}
