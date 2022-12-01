//메서드가 들어가는 파일



package com.sparta.hanghaememo.controller;


import com.sparta.hanghaememo.dto.MemoRequestDto;
import com.sparta.hanghaememo.dto.MemoResponseDto;
import com.sparta.hanghaememo.entity.Memo;
import com.sparta.hanghaememo.service.MemoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;


@RestController
@RequiredArgsConstructor
public class MemoController {

    private final MemoService memoService;

    @GetMapping("/")
    public ModelAndView home() {
        return new ModelAndView("index");
    }


    //메모장 만들기
    @PostMapping("/api/memos")  //post 방식알 body가 있고, 그 안에 저장해야하는 값이 있기 때문에 requestbody 사용.
    public Memo createMemo(@RequestBody MemoRequestDto requestDto) {
        //MemoRequestDto 객체로 받는다.
        return memoService.createMemo(requestDto);
    }


    @GetMapping("/api/memos")
    public List<Memo> getMemos() {
        return memoService.getMemos();

    }



    @GetMapping("/api/memo/{id}") //@RequestParam 받는 값이 api/memo?id=3 , @PathVariable 받는 값이 api/memo/3
    public MemoResponseDto getMemo(@PathVariable Long id){

        return memoService.getMemo(id);
    }





    @PutMapping("/api/memos/{id}")   //PathVariable 사용해서 값을 받아오기, RequestBody 부분에 있는 데이터를 가져오
    public MemoResponseDto updateMemo(@PathVariable Long id, @RequestBody MemoRequestDto requestDto) {
        return memoService.update(id, requestDto);
    }



    @DeleteMapping("/api/memos/{id}/{password}")
    public MemoResponseDto deleteMemo(@PathVariable Long id, @PathVariable String password){ //중요한 정보를 줄 ㅗ받음
        System.out.println("password controller = " + password);

        return memoService.deleteMemo(id, password);
    }
}

