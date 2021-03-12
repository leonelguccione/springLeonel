package com.utn.spring.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity //la clase es una entidad de persistencia
@Table(name="PERSONS")//agregado Leonel https://inezpre5.wordpress.com/2018/05/07/select-dependientes-con-spring-boot-mysql-y-angularjs/
public class Person
{
    @Id //primary Key por ser Entity
    @GeneratedValue(strategy = GenerationType.IDENTITY) //autogenerada
    private Integer id;
    private String name;
    private String lastName;
    @OneToMany(mappedBy = "person", fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    private List<Pet> pets;
}
