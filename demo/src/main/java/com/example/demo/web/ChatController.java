package com.example.demo.web;

import com.example.demo.dto.ChatMessage;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessageHeaderAccessor;
import org.springframework.stereotype.Controller;


@Controller
public class ChatController {

    @MessageMapping("/chat.sendMessage")
    @SendTo("/topic/public")
    public ChatMessage sendMessage(@Payload ChatMessage chatMessage) {

        System.out.println("요청 오는 거랑 받는 거??? " + chatMessage);

        return chatMessage;
    }

    @MessageMapping("/chat.addUser")
    @SendTo("/topic/public")
    public ChatMessage addUser(@Payload ChatMessage chatMessage, SimpMessageHeaderAccessor headerAccessor){
    	System.out.println("요청옴" + chatMessage.toString() + " ,  " + headerAccessor);
    	//SimpMessageHeaderAccessor 오직 1,
        //headerAccessor.getSessionAttributes().put("username", chatMessage.getSender());
        return chatMessage;
    }


}