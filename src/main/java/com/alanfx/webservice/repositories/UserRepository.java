package com.alanfx.webservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alanfx.webservice.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
