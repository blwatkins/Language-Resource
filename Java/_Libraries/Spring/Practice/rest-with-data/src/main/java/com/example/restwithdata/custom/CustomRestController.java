package com.example.restwithdata.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restwithdata.data.entity.Artist;
import com.example.restwithdata.data.repository.ArtistRepository;

@RestController
@RequestMapping("/custom")
public class CustomRestController {
    private ArtistRepository artistRepository;

    @Autowired
    public CustomRestController(ArtistRepository artistRepository) {
        this.artistRepository = artistRepository;
    }

    @GetMapping("/artists")
    public Iterable<Artist> getAllArtists() {
        return artistRepository.findAll();
    }
}
