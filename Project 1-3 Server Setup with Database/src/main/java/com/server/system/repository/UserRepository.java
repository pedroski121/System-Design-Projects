package com.server.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.server.system.model.User;


@Repository
public interface  UserRepository extends JpaRepository<User, Long> {
    
}
