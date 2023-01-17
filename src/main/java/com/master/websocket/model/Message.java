package com.master.websocket.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Message {
    private MessageType type;
    private String message;
    private String user;

    @Override
    public String toString() {
        return "Message{"
                + "message='" + message + '\''
                + ", user=" + user
                + '}';
    }

    public enum MessageType {
        CHAT,
        CONNECT,
        DISCONNECT
    }
}
