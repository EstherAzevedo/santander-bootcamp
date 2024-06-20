package me.dio.santander_bootcamp.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import me.dio.santander_bootcamp.domain.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

    
}