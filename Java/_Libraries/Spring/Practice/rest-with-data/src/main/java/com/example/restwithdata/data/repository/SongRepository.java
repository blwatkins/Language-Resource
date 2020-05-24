package com.example.restwithdata.data.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.restwithdata.data.entity.Song;

public interface SongRepository extends CrudRepository<Song, Long> {
}
