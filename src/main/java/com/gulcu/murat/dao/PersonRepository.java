package com.gulcu.murat.dao;

import java.util.List;

import javax.persistence.QueryHint;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.QueryHints;

import com.gulcu.murat.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
	
	@QueryHints({@QueryHint(name="org.hibernate.cacheable",value="true")}) // Bu sorguyu cache etmesi için kullanırız.
	List<Person> findAll(); 
}
