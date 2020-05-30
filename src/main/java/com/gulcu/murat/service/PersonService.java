package com.gulcu.murat.service;

import java.util.List;
import java.util.Optional;

import com.gulcu.murat.entities.Person;

public interface PersonService {
	List<Person> findAll();
	Optional<Person> findById(Long id);
	Person save(Person person);
}
