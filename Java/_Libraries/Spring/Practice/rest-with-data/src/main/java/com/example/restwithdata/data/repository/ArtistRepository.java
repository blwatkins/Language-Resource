package com.example.restwithdata.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.restwithdata.data.entity.Artist;

public interface ArtistRepository extends CrudRepository<Artist, Long> {
}
