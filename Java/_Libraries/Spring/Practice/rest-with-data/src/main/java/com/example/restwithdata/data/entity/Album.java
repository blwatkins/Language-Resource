package com.example.restwithdata.data.entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name="artistID", nullable=false)
    Artist artist;

    @OneToMany(mappedBy="album")
    private List<Song> songs;

    private String name;

    public Album(Artist artist, String name) {
        this.artist = artist;
        this.name = name;
    }

    protected Album() {

    }

    public long getId() {
        return id;
    }

    public Artist getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

    public void setName(String name) {
        this.name = name;
    }
}
