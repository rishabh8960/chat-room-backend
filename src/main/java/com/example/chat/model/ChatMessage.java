package com.example.chat.model;

import lombok.Data;

@Data
public class ChatMessage {
    private String sender;
    private String content;
    private String room;
    private String timestamp;
}