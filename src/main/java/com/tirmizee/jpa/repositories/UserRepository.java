package com.tirmizee.jpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.query.QueryByExampleExecutor;

import com.tirmizee.jpa.entities.User;

public interface UserRepository extends JpaRepository<User, Long>, JpaSpecificationExecutor<User>, QueryByExampleExecutor<User>{

}
