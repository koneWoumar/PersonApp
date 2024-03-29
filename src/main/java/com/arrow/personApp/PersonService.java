package com.arrow.personApp;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
	
	//Injection du repository de personne dans le service
	@Autowired
	private PersonRepository repository;
	
	//
	public PersonService() {}	
	
	//
	public void updatePerson(Person person) {
		repository.save(person);
	}
	//
	public void addPerson(Person person) {
		repository.save(person);
		}
	//
	public void deletPerson(int mat) {
		repository.deleteById(mat);
		}
	//
	public ArrayList<Person> getPersons() {
		return (ArrayList<Person>) repository.findAll();
	}
	//
	public Person getPerson(int mat) {
		return(repository.findById(mat).get());
	}
	
}
