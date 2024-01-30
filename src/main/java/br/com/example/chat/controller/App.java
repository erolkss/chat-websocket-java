package br.com.example.chat.controller;

import br.com.example.chat.config.Msg;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class App {

    @MessageMapping("/chatMessage")
    @SendTo("/chat")
    public Msg sendMessage(Msg message){
        return message;
    }

}
