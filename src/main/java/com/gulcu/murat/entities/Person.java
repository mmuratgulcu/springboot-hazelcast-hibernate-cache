package com.gulcu.murat.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "persons")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class Person{
	
	@Id
	@SequenceGenerator(name = "person_gen",sequenceName = "person_seq",allocationSize = 1)
	@GeneratedValue(generator = "person_seq",strategy = GenerationType.SEQUENCE)
	private Long id;
	private String name;
	private String surname;
	
	public Person(String name,String surname) {
		this(null, name, surname);
	}
}
