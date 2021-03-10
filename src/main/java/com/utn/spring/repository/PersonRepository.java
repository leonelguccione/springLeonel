package com.utn.spring.repository;

import com.utn.spring.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>
{
    //List<Person> findByName(String name);

    //otra forma de hacerlo con query nativa
    //video JPA6
   //@Query(value = "select * from person where name = ?1", nativeQuery = true )
    @Query("select p from Person p where p.name = ?1")
   List<Person> findByName(String name);
}


//public interface PersonRepository extends JpaRepository<entidad, id>