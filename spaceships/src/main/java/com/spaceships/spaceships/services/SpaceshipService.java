package com.spaceships.spaceships.services;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.spaceships.spaceships.models.Spaceship;

@Service
public class SpaceshipService {
    private final MongoOperations mongoOperations;

    public SpaceshipService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    @SuppressWarnings("null")
    public Spaceship addSpaceship(Spaceship spaceship) {
        return mongoOperations.insert(spaceship);
    }
}
