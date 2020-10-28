package com.example.tangtang.boot.launch.DAO.testdb3;

import org.springframework.data.jpa.repository.JpaRepository;

import javax.annotation.Resource;


//分页，排序，查找，删除，更新   泛型Article要操作的数据库表对应的实体类Po，id属性：实体主键的类型Long
public interface ArticleRepository extends JpaRepository<Article,Long> {


}
