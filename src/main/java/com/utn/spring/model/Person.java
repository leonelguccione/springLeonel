package com.utn.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity //la clase es una entidad de persistencia
public class Person
{
    @Id //primary Key por ser Entity
    @GeneratedValue //autogenerada
    private Integer id;
    private String name;
    private String lastName;
    //@OneToMany(mappedBy = "person")
    //private List<Pet> pets;
}
