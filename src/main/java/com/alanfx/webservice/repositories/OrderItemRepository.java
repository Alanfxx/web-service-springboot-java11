package com.alanfx.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alanfx.webservice.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
