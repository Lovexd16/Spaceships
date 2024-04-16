package com.spaceships.spaceships.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spaceships.spaceships.models.Spaceship;
import com.spaceships.spaceships.services.SpaceshipService;

@RestController
public class SpaceshipController {

    private SpaceshipService spaceshipService;

    public SpaceshipController(SpaceshipService spaceshipService) {
        this.spaceshipService = spaceshipService;
    }

    @GetMapping
    public String getRoot() {
        return "{'Hello': 'World!'}";
    }

    @GetMapping("/spaceships")
    public List<Spaceship> getSpaceships() {
        return spaceshipService.getSpaceships();
    }

    @GetMapping("/spaceship/{id}")
    public Spaceship getSpaceship(@PathVariable String id) {
        return spaceshipService.getSpaceship(id);
    }

    @PostMapping("/spaceship")
    public Spaceship addSpaceship(@RequestBody Spaceship spaceship) {
        return spaceshipService.addSpaceship(spaceship);
    }
}
