package com.sparta.hanghaememo.dto;
//DTO(Data Transfer Object)란 계층간 데이터 교환을 위해 사용하는 객체(Java Beans)입니다.

import lombok.Getter;

@Getter
public class MemoRequestDto {
    private String username;   //객체
    private String contents;
    private String title;
    private String dates;
}
