package com.qa.main.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.qa.main.domain.Person;
import com.qa.main.repository.PersonRepo;

@Service
public class PersonService {

	private PersonRepo repo;
	
	public PersonService(PersonRepo repo) {
		super();
		this.repo=repo;
	}

	public Person create(Person person) {
		return this.repo.save(person);
	}

	public List<Person> readAll() {
		return this.repo.findAll();
	};

	public Person read(Long id) {
		Optional<Person> personOp = this.repo.findById(id);
		Person person = personOp.get();
		return person;
	};

	public Person update(Long id, Person newPerson) {
		Optional<Person> personOp = this.repo.findById(id);
		Person person = personOp.get();
		person.setFirstName(newPerson.getFirstName());
		person.setLastName(newPerson.getLastName());
		person.setEmail(newPerson.getEmail());
		return this.repo.save(person);
	};

	public boolean delete(Long id) {
		this.repo.deleteById(id);
		boolean exists = this.repo.existsById(id);
		return !exists;
	};
}
