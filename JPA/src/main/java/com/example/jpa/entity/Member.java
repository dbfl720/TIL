package com.example.jpa.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter   //값을 가져오겠다
@NoArgsConstructor  //기본 생성자 만들어줌
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column (nullable = false)
    private String memberName;



    @OneToMany(mappedBy = "member", fetch = FetchType.EAGER)   //연관관계 주인은 member이다.
    //command + e = file로 가기
    private List<Orders> orders = new ArrayList<>();

    //표준 배열보다는 느리지만 배열에서 많은 조작이 필요한 경우 유용하게 사용할 수 있습니다
    //    List 인터페이스에서 상속받아 사용이 됩니다
    //
    //    ArrayList는 객체가 추가되어 용량을 초과하면 자동으로 부족한 크기만큼 용량이 늘어납니다



    public Member(String memberName) {      //생성자 command + n = constructor
        this.memberName = memberName;
    }
}


