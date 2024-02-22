package com.app.chatroom.controller;

import com.app.chatroom.models.Message;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.web.bind.annotation.RequestBody;

public class MessageController {

    @MessageMapping("/message")
    @SendTo("/topic/return-to")
    public Message getContent(@RequestBody Message message){
        try {
            //processing
            Thread.sleep(2000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        return message;
    }
}
