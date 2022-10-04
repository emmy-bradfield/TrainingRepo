package com.qa.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.qa.main.domain.Person;

@Repository
public interface PersonRepo extends JpaRepository<Person, Long>{

}
