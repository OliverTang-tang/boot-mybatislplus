package com.example.tangtang.boot.launch.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class Reader {
    private String name;
    private Integer age;
}
