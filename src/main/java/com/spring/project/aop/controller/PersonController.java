package com.spring.project.aop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.project.aop.model.PersonModelClass;
import com.spring.project.aop.service.PersonService;

@RestController
public class PersonController {
	@Autowired
	PersonService service;
	
	@PostMapping("/savePerson")
	public ResponseEntity<PersonModelClass> savePerson(@RequestBody PersonModelClass p){
		PersonModelClass p1=service.saveAllPeople(p);
		return  ResponseEntity.ok().body(p1);
	}
	
	@GetMapping("/getAllPersons")
	public List<PersonModelClass> getAllPersons(){
		return service.getAllPerson();
	}
}
