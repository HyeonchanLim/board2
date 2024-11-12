package com.green.board2;

import com.green.board2.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardMapper mapper;


    public int postBoard(BoardPostReq p) {
        return mapper.postBoard(p);
    }

    public List<BoardSelRes> selBoardList(){
        return mapper.selBoardList();
    }
    public BoardSelOneRes selBoardOne(int p){
        return mapper.selBoardOne(p);
    }
    public int updBoard(BoardUpdReq p) {
        return mapper.updBoard(p);
    }
    public int delBoard(BoardDelReq p) {
        return mapper.delBoard(p);
    }

}
