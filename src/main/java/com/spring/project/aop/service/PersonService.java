package com.spring.project.aop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.project.aop.model.PersonModelClass;
import com.spring.project.aop.repository.PeopleRepository;

@Service
public class PersonService {
	@Autowired
	private PeopleRepository repo;

	public PersonModelClass saveAllPeople(PersonModelClass p) {
		return repo.save(p);
	}
	
	public List<PersonModelClass> getAllPerson(){
		return repo.findAll();
	}
}
