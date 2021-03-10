package com.utn.spring.controller;

import com.utn.spring.model.Person;
import com.utn.spring.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//indica que es un controlador, expone url.
@RequestMapping("/person")
//A través de routers. Es una ruta general a toda la clase

public class PersonController
{
    private final PersonService personService;
    //Puerta de entrada para Spring

    @Autowired
    public PersonController(PersonService personService)
    {
        this.personService = personService;
    }

   /* @GetMapping("/")//ruta
    public Person getPerson()
    {
        return new Person();
    }*/
    @GetMapping("/{personId}")
    public Person getPersonById(@PathVariable Integer personId)
    {
        return new Person();
    }

    @PostMapping("/")
    //desde acá, el controlador, debemos llamar al Service, que lo vamos a crear ahora
    //Viene el parámetro en un formato de petición web, por eso debe ponerse la @RequestBody
    //Se le pasa un objeto
    //convierte el Json que viene de la petición y lo transforma al objeto Person
    public void addPerson(@RequestBody Person unaPersona)
    {
        personService.addPerson(unaPersona);
    }

    //JPA 5 minuto 1
    @GetMapping("/")
    public List<Person> getAll(@RequestParam(required = false) String name)
    {
        return personService.getAll(name);
    }

}
