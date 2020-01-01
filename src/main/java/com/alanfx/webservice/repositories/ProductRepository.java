package com.alanfx.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alanfx.webservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
