package com.cy.docker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@SpringBootApplication
@RestController
public class DockerApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerApplication.class, args);
    }

    @GetMapping("/user/find")
    public Object findUser(){
        Map<Object, Object> hashMap = new HashMap<>();
        hashMap.put("name","chengyang");
        hashMap.put("age","20");
        hashMap.put("sex","男");
        return hashMap;
    }
}
