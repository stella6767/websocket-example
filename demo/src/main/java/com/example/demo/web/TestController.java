package com.example.demo.web;


import com.example.demo.dto.ChatMessage;
import com.example.demo.dto.MessageType;
import com.example.demo.service.WebSocketService;
import com.example.demo.web.ChatController;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TestController {

    @Autowired
    private WebSocketService webSocketService;


    @GetMapping("/test")
    public void test(){

        webSocketService.sendMessage(new ChatMessage(MessageType.CHAT, "?????" ,"??????"));

    }

}
