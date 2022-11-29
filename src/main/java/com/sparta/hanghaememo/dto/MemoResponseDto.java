package com.sparta.hanghaememo.dto;


import com.sparta.hanghaememo.entity.Memo;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class MemoResponseDto {

    private String username;   //객체
    private String contents;
    private String title;
    private String dates;

    public MemoResponseDto(Memo memo) {
        this.username = memo.getUsername();
        this.contents = memo.getContents();
        this.title = memo.getTitle();
        this.dates = memo.getDates();

    }
}
