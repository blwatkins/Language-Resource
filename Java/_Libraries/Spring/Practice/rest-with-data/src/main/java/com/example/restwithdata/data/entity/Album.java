package com.example.restwithdata.data.entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class Album {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy="album")
    private List<Song> songs;


    private String name;

    public Album(String name) {
        this.name = name;
    }

    protected Album() {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
