package com.emily.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.emily.main.domain.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{

}
