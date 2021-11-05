package com.example.demo.web;

import com.example.demo.config.WebSocket;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;

@RequiredArgsConstructor
@org.springframework.web.bind.annotation.RestController
public class RestController {


    private final WebSocket webSocket;


    @GetMapping("/test")
    public void ss(){

        webSocket.sendMessageToAll("서버 => 클라이언트 단방향 전송이 되는지 테스트");
    }

}
