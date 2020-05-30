package com.gulcu.murat;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.gulcu.murat.dao.PersonRepository;
import com.gulcu.murat.entities.Person;

@SpringBootApplication
@EnableJpaAuditing
public class AppMain {

	public static void main(String[] args) {
		SpringApplication.run(AppMain.class, args);
	}
	
	@Autowired
	private PersonRepository personRepository;

	@EventListener(ApplicationStartedEvent.class)
	public void generateDefaultData() {
		List<Person> persons = new ArrayList<>();
		for (int i = 0; i < 1500; i++) {
			persons.add(new Person("Murat","Gülcü"));
		}
		personRepository.saveAll(persons);
	}
}
