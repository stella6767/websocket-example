package com.example.demo.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;
import org.springframework.web.socket.config.annotation.WebSocketMessageBrokerConfigurer;

@Configuration
@EnableWebSocketMessageBroker//@EnableWebSocketMessageBroker is used to enable our WebSocket server
public class WebSocketConfig implements WebSocketMessageBrokerConfigurer {


    @Override
    public void registerStompEndpoints(StompEndpointRegistry registry) {
        registry.addEndpoint("/ws") //client에서 websocket을 연결할 api를 설정, 여러개의 endpoint 설정가능
        	.setAllowedOriginPatterns("*")
        	.withSockJS();
    }


    @Override
    public void configureMessageBroker(MessageBrokerRegistry registry) {
        registry.setApplicationDestinationPrefixes("/app"); //서버에서 클라이언트로부터의 메시지를 받을 api의 prefix 설정
        registry.enableSimpleBroker("/topic"); //메세지 브로커가 해당 api를 구독하고 있는 클라이언트에게 메시지를 전달
    }
}