package com.example.accessingdata.data.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.accessingdata.data.entity.Customer;


public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}
