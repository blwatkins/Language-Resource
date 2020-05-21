package com.example.learningSpring.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.learningSpring.data.entity.Guest;

@Repository
public interface GuestRepository extends CrudRepository<Guest, Long> {
}
