package com.spaceships.spaceships.services;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
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

    public List<Spaceship> getSpaceships() {
        return mongoOperations.findAll(Spaceship.class);
    }

    public Spaceship getSpaceship(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));

        return mongoOperations.findOne(query, Spaceship.class);
    }
}
