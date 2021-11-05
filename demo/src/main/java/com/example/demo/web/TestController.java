package com.example.demo.web;


import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Slf4j
@Controller
public class TestController {


    @GetMapping("/chat")
    public String chat(){

        return "chat";
    }


}
