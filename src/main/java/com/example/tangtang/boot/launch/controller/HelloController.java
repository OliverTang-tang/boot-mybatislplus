package com.example.tangtang.boot.launch.controller;

import com.example.tangtang.boot.launch.AjaxResponse;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/login")
public class HelloController {

    @PostMapping("/user")
    public AjaxResponse hello(@RequestBody Map map){
       return AjaxResponse.success("账户名和密码是"+map.get("username")+map.get("password"));
    }
}
