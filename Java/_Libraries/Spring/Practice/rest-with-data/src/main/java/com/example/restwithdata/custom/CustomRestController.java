package com.example.restwithdata.custom;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.restwithdata.data.entity.Album;
import com.example.restwithdata.data.repository.AlbumRepository;
import com.example.restwithdata.data.entity.Artist;
import com.example.restwithdata.data.repository.ArtistRepository;

@RestController
@RequestMapping("/custom")
public class CustomRestController {
    private ArtistRepository artistRepository;
    private AlbumRepository albumRepository;

    @Autowired
    public CustomRestController(ArtistRepository artistRepository, AlbumRepository albumRepository) {
        this.artistRepository = artistRepository;
        this.albumRepository = albumRepository;
    }

    @GetMapping("/artists")
    public Iterable<Artist> getAllArtists() {
        return artistRepository.findAll();
    }

    @GetMapping("/albums")
    public Iterable<Album> getAllAlbums() {
        return albumRepository.findAll();
    }
}
