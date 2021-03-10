package com.utn.spring.service;

import com.utn.spring.model.Person;
import com.utn.spring.model.Pet;
import com.utn.spring.repository.PersonRepository;
import com.utn.spring.repository.PetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static java.util.Objects.isNull;

@Service
public class PetService
{
    private final PetRepository petRepository;
    @Autowired
    public PetService(PetRepository petRepository)
    {
        this.petRepository = petRepository;
    }

    public void addPet(Pet unaPet)
    {
        petRepository.save(unaPet);
    }

    public List<Pet> getAll(String name)
    {
        if(isNull(name))
        {
            return petRepository.findAll();
        }
        return petRepository.findByName(name);
    }
}
