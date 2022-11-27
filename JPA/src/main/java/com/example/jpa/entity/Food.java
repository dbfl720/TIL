package com.example.jpa.entity;


import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor

public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String foodName;
    @Column(nullable = false)
    private int price;



    @OneToMany(mappedBy = "food", fetch = FetchType.EAGER)
    //mappedBy는 연관관계 주인을  지정.   @JoinColumn(name = "food_id") 주인을 알려줌.
    private List<Orders> orders = new ArrayList<>();


    public Food(String foodName, int price) {  //생성자 추가   - command + n  = constructor
        this.foodName = foodName;
        this.price = price;



    }



}
