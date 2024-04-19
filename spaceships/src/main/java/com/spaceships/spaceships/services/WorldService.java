package com.spaceships.spaceships.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spaceships.spaceships.models.World;

@Service
public class WorldService {

    private WorldRepository worldRepository;

    public WorldService(WorldRepository worldRepository) {
        this.worldRepository = worldRepository;
    }

    public World addWorld(World world) {
        return worldRepository.insert(world);
    }

    public World getWorldByName(String worldName) {
        return worldRepository.findByWorldNameLikeIgnoreCase(worldName);
    }

    public World getWorldById(String id) {
        Optional<World> world = worldRepository.findById(id);

        if (world.isPresent()) {
            return world.get();
        } else {
            return null;
        }

    }

    public World editWorldName(String id, World world) {
        worldRepository.findAndSetNameById(id, world.getWorldName());
        Optional<World> newWorld = worldRepository.findById(id);

        return newWorld.get();
    }

    public void deleteWorld(String id) {
        worldRepository.deleteById(id);
    }
}
