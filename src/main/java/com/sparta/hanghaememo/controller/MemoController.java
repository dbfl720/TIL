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
    public String deleteMemo(@PathVariable Long id, @PathVariable String password){ //중요한 정보를 줄 ㅗ받음
        System.out.println("password controller = " + password);
                
        return memoService.deleteMemo(id, password);
    }
}
//    매핑의 URL에 { } 로 들어가는 패스 변수(path variable)를 받는다.
//
//        요청 파라미터를 URL의 쿼리 스트링으로 보내는 대신 URL 패스로 풀어서 쓰는 방식을 쓰는 경우 매우 유용하다.
//
//


//
//import com.sparta.hanghaememo.dto.MemoRequestDto;
//import com.sparta.hanghaememo.entity.Memo;
//import com.sparta.hanghaememo.service.MemoService;
//import lombok.RequiredArgsConstructor;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.servlet.ModelAndView;
//
//import java.util.List;
//
//    @RestController
//    @RequiredArgsConstructor
//    public class MemoController {
//
//        private final MemoService memoService;
//
//        @GetMapping("/")
//        public ModelAndView home() {
//            return new ModelAndView("index");
//        }
//
//        @PostMapping("/api/memos")
//        public Memo createMemo(@RequestBody MemoRequestDto requestDto) {
//            return memoService.createMemo(requestDto);
//        }
//
//        @GetMapping("/api/memos")
//        public List<Memo> getMemos() {
//            return memoService.getMemos();
//        }
//
//        @PutMapping("/api/memos/{id}")
//        public Long updateMemo(@PathVariable Long id, @RequestBody MemoRequestDto requestDto) {
//            return memoService.update(id, requestDto);
//        }
//
//        @DeleteMapping("/api/memos/{id}")
//        public Long deleteMemo(@PathVariable Long id) {
//            return memoService.deleteMemo(id);
//        }
//
//    }
//}
