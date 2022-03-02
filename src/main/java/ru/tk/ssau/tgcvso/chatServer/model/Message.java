package ru.tk.ssau.tgcvso.chatServer.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Message {

    private String from;
    private String to;
    private String content;
    private String date;
    private Status status;
}
