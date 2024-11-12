package com.green.board2.model;

// insert 때 사용

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class BoardPostReq {
    private String title;
    private String contents;
    private String writer;
}
