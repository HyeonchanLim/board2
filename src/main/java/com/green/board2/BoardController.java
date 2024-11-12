package com.green.board2;

import com.green.board2.model.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("board")
@RequiredArgsConstructor

public class BoardController {
    private final BoardService service;

    @PostMapping
    public int postBoard(@RequestBody BoardPostReq p){
        System.out.println(p);
        return service.postBoard(p);
    }

    @GetMapping
    public List<BoardSelRes> selBoardList(){
        return service.selBoardList();
    }

    @GetMapping("{boardId}")
    public BoardSelOneRes selBoardOne(@PathVariable int boardId){
        System.out.println(boardId);
        return service.selBoardOne(boardId);
    }

    @PutMapping
    public int updBoard(@RequestBody BoardUpdReq p){
        System.out.println(p);
        return service.updBoard(p);
    }
    @DeleteMapping
    public int delBoard(@ModelAttribute BoardDelReq p){
        System.out.println(p);
        return service.delBoard(p);
    }
}
