package ru.tk.ssau.tgcvso.chatServer.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {

    private String senderName;
    private String receiverName;
    private String content;
    private Status status;
}
