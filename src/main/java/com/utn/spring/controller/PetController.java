package com.utn.spring.controller;

import com.utn.spring.service.PersonService;
import com.utn.spring.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
