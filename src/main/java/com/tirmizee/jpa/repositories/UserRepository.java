package com.tirmizee.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tirmizee.jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
