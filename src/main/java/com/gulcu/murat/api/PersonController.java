package com.gulcu.murat.api;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gulcu.murat.entities.Person;
import com.gulcu.murat.service.PersonService;

@RestController
@RequestMapping("/hazelcast")
public class PersonController {

	private final PersonService personService;	
	
	public PersonController(PersonService personService) {
		this.personService = personService;
	}

	@GetMapping("/all")
	public List<Person> findAll() {
		return personService.findAll();
	}
	
	@GetMapping("findById/{id}")
	public Optional<Person> getById(@PathVariable("id") Long id) {
		return personService.findById(id);
	}
	
	@PostMapping
	public Person save(@RequestBody Person person) {
		return personService.save(person);
	}
}
