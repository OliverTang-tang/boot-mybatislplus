package com.example.tangtang.boot.launch.DAO.testdb4;

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
@Table(name = "message")//与实体类对应的表
public class Message {

    //@JsonIgnore
    //@JsonProperty(value = "学号")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//主键
    private Long id;

    @Column(nullable = false)
    private String name;



    @Column(nullable = false)
    private  String content;




    //查询语句时要加上无参构造方法
}
