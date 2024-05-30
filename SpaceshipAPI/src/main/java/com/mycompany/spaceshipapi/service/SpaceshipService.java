/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Apasp
 */
package com.mycompany.spaceshipapi.service;

import com.mycompany.spaceshipapi.entity.Spaceship;
import com.mycompany.spaceshipapi.repository.SpaceshipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;

@Service
public class SpaceshipService {
    @Autowired
    private SpaceshipRepository spaceshipRepository;

    @Cacheable("spaceships")
    public Page<Spaceship> getAllSpaceships(Pageable pageable) {
        return spaceshipRepository.findAll(pageable);
    }

    @Cacheable("spaceship")
    public Spaceship getSpaceshipById(Long id) {
        return spaceshipRepository.findById(id).orElse(null);
    }

    public List<Spaceship> getSpaceshipsByName(String name) {
        return spaceshipRepository.findByNameContaining(name);
    }

    public Spaceship createSpaceship(Spaceship spaceship) {
        return spaceshipRepository.save(spaceship);
    }

    public Spaceship updateSpaceship(Spaceship spaceship) {
        return spaceshipRepository.save(spaceship);
    }

    public void deleteSpaceship(Long id) {
        spaceshipRepository.deleteById(id);
    }
}


