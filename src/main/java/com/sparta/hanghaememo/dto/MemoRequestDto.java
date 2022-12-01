package com.sparta.hanghaememo.dto;
//DTO(Data Transfer Object)란 계층간 데이터 교환을 위해 사용하는 객체(Java Beans)입니다.  여기서는 객체를 만듬!

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class MemoRequestDto {
    private String username;   //객체
    private String contents;
    private String title;
    private String password;


}

//    @NotBlank(message = "비밀번호 확인을 입력해주세요")
//    private String checkpw;
//
//    }