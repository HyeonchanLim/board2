package com.green.board2.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class BoardSelRes {
    private int boardId;
    private String title;
    private String writer;
    private String createdAt;
}
