package com.spring.project.aop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.project.aop.model.PersonModelClass;

@Repository
public interface  PeopleRepository extends JpaRepository<PersonModelClass, Integer> {

}
