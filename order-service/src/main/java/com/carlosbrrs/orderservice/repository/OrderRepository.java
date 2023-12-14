package com.carlosbrrs.orderservice.repository;

import com.carlosbrrs.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
