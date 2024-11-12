package com.green.board2.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter


public class BoardSelOneRes {
    private int boardId;
    private String title;
    private String contents;
    private String writer;
    private String createdAt;
}
