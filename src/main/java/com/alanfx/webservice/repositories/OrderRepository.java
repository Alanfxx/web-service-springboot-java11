package com.alanfx.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alanfx.webservice.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
