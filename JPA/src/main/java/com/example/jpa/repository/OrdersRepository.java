package com.example.jpa.repository;

import com.example.jpa.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;



//Database와 연결된 repository 3개를 다 만들었음.
public interface OrdersRepository extends JpaRepository <Orders, Long>{

}
