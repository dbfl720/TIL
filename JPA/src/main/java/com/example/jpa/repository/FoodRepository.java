package com.example.jpa.repository;

import com.example.jpa.entity.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {   //command + JpaRepository 클릭하면 하는 방법 나옴
}
