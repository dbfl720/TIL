package com.example.jpa.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Getter
@NoArgsConstructor

public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "food_id")
    private Food food;


    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;


    public Orders(Food food, Member member) {  //생성자 추가
        this.food = food;
        this.member = member;


    }
}


