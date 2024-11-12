package com.green.board2;


import com.green.board2.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {
    int postBoard(BoardPostReq p);
    List<BoardSelRes> selBoardList();
    BoardSelOneRes selBoardOne(int p);
    int updBoard(BoardUpdReq p);
    int delBoard(BoardDelReq p);
}
