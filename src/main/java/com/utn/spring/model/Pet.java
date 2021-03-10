package com.utn.spring.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Pet
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//TODO: averiguar para que sirve este strategy
    private Integer id;
    private String name;
    private Integer kg;
    //@ManyToOne(fetch=FetchType.EAGER) //TODO: Ver esto
    //@JsonBackReference //este objeto persona que esta en Pet en realidad es una referencia. Evita el bucle infinito al armar un String.
    //private Person person;

}
