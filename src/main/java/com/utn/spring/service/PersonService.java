package com.utn.spring.service;

import com.utn.spring.model.Person;
import com.utn.spring.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.isNull;

@Service
public class PersonService
{
    private final PersonRepository personRepository;
    @Autowired
    public PersonService(PersonRepository personRepository)
    {
        this.personRepository = personRepository;
    }

    public void addPerson(Person unaPersona)
    {
        personRepository.save(unaPersona);
    }

    public List<Person> getAll(String name)
    {
        if(isNull(name))
        {
            return personRepository.findAll();
        }
        return personRepository.findByName(name);
    }
}
