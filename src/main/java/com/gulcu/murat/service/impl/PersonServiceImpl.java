package com.gulcu.murat.service.impl;

import java.util.List;
import java.util.Optional;

import com.gulcu.murat.dao.PersonRepository;
import com.gulcu.murat.entities.Person;
import com.gulcu.murat.service.PersonService;

public class PersonServiceImpl implements PersonService{

	private final PersonRepository personRepository;
	
	public PersonServiceImpl(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}

	@Override
	public List<Person> findAll() {
		return personRepository.findAll();
	}

	@Override
	public Optional<Person> findById(Long id) {
		return personRepository.findById(id);
	}

	@Override
	public Person save(Person person) {
		return personRepository.save(person);
	}

}
