package com.example.restwithdata.data.entity;

import javax.persistence.*;

@Entity
public class Song {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    private String name;
    private int trackNumber;

    public Song(String name, int trackNumber) {
        this.name = name;
        this.trackNumber = trackNumber;
    }

    protected Song() {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }
}
