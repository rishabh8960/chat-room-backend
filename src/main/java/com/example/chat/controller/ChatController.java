
package com.example.chat.controller;

import com.example.chat.model.ChatMessage;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class ChatController {

    @MessageMapping("/chat/{room}")
    @SendTo("/topic/{room}")
    public ChatMessage send(@DestinationVariable String room, ChatMessage message) {
        return message;
    }
}
