package com.spaceships.spaceships.controllers;

import org.springframework.web.bind.annotation.GetMapping;
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

    @PostMapping("/spaceship")
    public Spaceship addSpaceship(@RequestBody Spaceship spaceship) {
        return spaceshipService.addSpaceship(spaceship);
    }
}
