package com.example.tangtang.boot.launch.model;

import com.fasterxml.jackson.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Data
@Builder
@JsonPropertyOrder(value={"content","author"})
@NoArgsConstructor
@AllArgsConstructor
public class ArticleVo {

    //@JsonIgnore
    //@JsonProperty(value = "学号")
    private Long id;
    private String author;
    private String title;
    private  String content;

    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date createTime;

    //@JsonInclude(JsonInclude.Include.NON_NULL) //如果返回值是null就不返回
    List<Reader> readers;

    //查询语句时要加上无参构造方法
}
