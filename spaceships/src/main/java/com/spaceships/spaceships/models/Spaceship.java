package com.spaceships.spaceships.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Spaceships")
public class Spaceship {
    @Id
    private String id;
    private String spaceshipName;
    private String captain;
    private int crew;
    private int size;
    private String world;

    public Spaceship(String id, String spaceshipName, String captain, int crew, int size, String world) {
        this.id = id;
        this.spaceshipName = spaceshipName;
        this.captain = captain;
        this.crew = crew;
        this.size = size;
        this.world = world;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSpaceshipName() {
        return spaceshipName;
    }

    public void setSpaceshipName(String spaceshipName) {
        this.spaceshipName = spaceshipName;
    }

    public String getCaptain() {
        return captain;
    }

    public void setCaptain(String captain) {
        this.captain = captain;
    }

    public int getCrew() {
        return crew;
    }

    public void setCrew(int crew) {
        this.crew = crew;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

}
