package com.example.restwithdata.data.entity;

import java.util.List;

import javax.persistence.*;

@Entity
public class Artist {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @OneToMany(mappedBy="artist")
    private List<Album> albums;

    @Column(nullable=false)
    private String name;

    public Artist(String name) {
        this.name = name;
    }

    protected Artist() {

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
