package com.example.restwithdata.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.restwithdata.data.entity.Album;

public interface AlbumRepository extends CrudRepository<Album, Long> {
}
