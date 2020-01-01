package com.alanfx.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alanfx.webservice.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{

}
