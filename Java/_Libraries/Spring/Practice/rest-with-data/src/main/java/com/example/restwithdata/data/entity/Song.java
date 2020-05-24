package com.example.restwithdata.data.entity;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @ManyToOne
    @JoinColumn(name="albumID", nullable=false)
    Album album;

    private String name;
    private int trackNumber;

    public Song(Album album, String name, int trackNumber) {
        this.album = album;
        this.name = name;
        this.trackNumber = trackNumber;
    }

    protected Song() {

    }

    public long getId() {
        return id;
    }

    public Album getAlbum() {
        return album;
    }

    public String getName() {
        return name;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }
}
