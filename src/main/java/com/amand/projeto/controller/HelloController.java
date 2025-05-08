package com.amand.projeto.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class HelloController {

    @GetMapping("/hello")
    public String hello(){
        return "Olá";
    }

    @Value("${spring.application.name}")
    private String autor;

    @Value("${spring.application.projeto}")
    private String projeto;

    @Value("${spring.application.data}")
    private String data;


    @GetMapping("/autor")
    public String autor(){
        return autor + projeto + data;
    }


}
