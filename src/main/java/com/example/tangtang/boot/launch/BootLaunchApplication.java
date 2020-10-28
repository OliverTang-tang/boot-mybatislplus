package com.example.tangtang.boot.launch;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@ImportResource(locations = {"classpath:/otherconfig/bean.xml"})
@SpringBootApplication
@MapperScan(basePackages = {"com.example.tangtang.boot.launch.Mapper"})
public class BootLaunchApplication {


	public static void main(String[] args) {
		SpringApplication.run(BootLaunchApplication.class, args);
	}

}
/*通过idea插件生成代码
* mybatis-generator plugin
* 安装好了之后-设置 一个是model package：generator 实体类存放路径
* 一个是dao package：generator
* 还有dao postfix java类文件后缀 Mapper
* xml package xml文件存放路径：generator
* model folder： src.main/java          实体类包路径
* dao         同上                     持久层接口
* xml            src/main/resources xml文件存放地址
* page comment  overWrite-Xml  toString/hashCode/equals  Use-Schema  Use-Example mysql-8
*
* */
