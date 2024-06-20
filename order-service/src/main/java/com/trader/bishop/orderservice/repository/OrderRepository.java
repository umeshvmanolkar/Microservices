package com.trader.bishop.orderservice.repository;

import com.trader.bishop.orderservice.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
