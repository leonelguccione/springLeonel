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
@Table(name="PETS")
public class Pet
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//TODO: averiguar para que sirve este strategy
    private Integer id;
    private String name;
    private Integer kg;
    @ManyToOne(fetch=FetchType.LAZY, optional = false)
    @JoinColumn(name="person_id", nullable = false)
    private Person person;

}
