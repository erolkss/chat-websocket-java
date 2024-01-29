package br.com.example.chat.controller;

import br.com.example.chat.config.Msg;
import org.springframework.stereotype.Controller;

@Controller
public class App {
    public Msg sendMessage(Msg message){
        return message;
    }

}
