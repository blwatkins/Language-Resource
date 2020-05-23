package com.example.accessingjpadatarest.data.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.example.accessingjpadatarest.data.entity.Person;

@RepositoryRestResource(collectionResourceRel="people", path="people")
public interface PersonRepository extends CrudRepository<Person, Long> {
    List<Person> findByLastName(String lastName);
}
