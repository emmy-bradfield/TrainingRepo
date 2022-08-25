package com.qa.main.controller;

import java.util.ArrayList;
import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qa.main.domain.Person;
import com.qa.main.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {
	
	private PersonService service;
	
	public PersonController(PersonService service) {
		super();
		this.service = service;
	}

	// Temporary Storage
	private List<Person> people = new ArrayList<>();

	// POST -> Create Customer
	@PostMapping("/create")
	public Person create(@RequestBody Person person) {
		return this.service.create(person);
	}

	// GET - Read All Customers
	@GetMapping("/readAll")
	public List<Person> readAll() {
		return this.service.readAll();
	};

	// GET -> Read This Customer
	@GetMapping("/read")
	public Person read(@PathParam("id") Long id) {
		return this.service.read(id);
	};

	// PUT -> Update Customer
	@PutMapping("/update")
	public Person update(@PathParam("id") Long id, @RequestBody Person person) {
		return this.service.update(id, person);
	};

	// DELETE -> Delete Customer
	@DeleteMapping("/delete/{id}")
	public boolean delete(@PathVariable Long id) {
		return this.service.delete(id);
	}

	
	// Getters and Setters
	public List<Person> getPeople() {
		return people;
	}

	public void setPeople(List<Person> people) {
		this.people = people;
	};

	

}
