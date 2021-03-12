package com.utn.spring.controller;

import com.utn.spring.service.PersonService;
import com.utn.spring.service.PetService;
import com.utn.spring.model.Pet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
//indica que es un controlador, expone url.
@RequestMapping("/pet")
//A través de routers. Es una ruta general a toda la clase
public class PetController
{
    private final PetService petService;
    //Puerta de entrada para Spring

    @Autowired
    public PetController(PetService petService)
    {
        this.petService = petService;
    }

    @PostMapping("/")
    public void addPet(@RequestBody Pet unaPet) //viene en formato de petición web
    //transforma el jason que viene de la petición y lo transforma al objeto Pet
    {
        petService.addPet(unaPet);
    }

    @GetMapping("/")
    public List<Pet> getAll(@RequestParam(required = false) String name)
    {
        return petService.getAll(name);
    }
}
