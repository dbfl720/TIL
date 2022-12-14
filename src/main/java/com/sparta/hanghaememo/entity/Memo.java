

package com.sparta.hanghaememo.entity;



//import com.example.hanghaememo.dto.MemoRequestDto;
import com.sparta.hanghaememo.dto.MemoRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;



@Getter
@Entity
@NoArgsConstructor
public class Memo extends Timestamped {  //Timestamped가 상속이 되어서 같이 사용 될 것임.
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;           //삭제하니깐 Memo  에서 오류남. ? 이유가?
    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String contents;


    @Column(nullable = false)
    private String title;


//    @Column(nullable = false)
//    private String dates;


    @Column(nullable = false)
    private String password;

//    public Memo(String username, String contents) {
//        this.username = username;
//        this.contents = contents;
//    }

    public Memo(MemoRequestDto requestDto) {  //생성자
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
        this.title = requestDto.getTitle();
        this.password = requestDto.getPassword();
    }

    public void update(MemoRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.contents = requestDto.getContents();
        this.title = requestDto.getTitle();
        this.password = requestDto.getPassword();


    }
}
//
//
//    public void update(MemoRequestDto memoRequestDto) {
//        this.username = memoRequestDto.getUsername();
//        this.contents = memoRequestDto.getContents();
//    }
//
//
