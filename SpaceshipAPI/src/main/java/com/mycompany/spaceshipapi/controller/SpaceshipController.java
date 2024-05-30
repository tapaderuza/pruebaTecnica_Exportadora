/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Apasp
 */
package com.mycompany.spaceshipapi.controller;

import com.mycompany.spaceshipapi.entity.Spaceship;
import com.mycompany.spaceshipapi.service.SpaceshipService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/spaceships")
@Api(value = "Spaceship Management System", description = "Operations pertaining to spaceship in Spaceship Management System")
public class SpaceshipController {
    @Autowired
    private SpaceshipService spaceshipService;

    @ApiOperation(value = "View a list of available spaceships", response = Page.class)
    @GetMapping
    public Page<Spaceship> getAllSpaceships(@RequestParam(defaultValue = "0") int page, @RequestParam(defaultValue = "10") int size) {
        return spaceshipService.getAllSpaceships(PageRequest.of(page, size));
    }

    @ApiOperation(value = "Get a spaceship by Id")
    @GetMapping("/{id}")
    public Spaceship getSpaceshipById(@PathVariable Long id) {
        return spaceshipService.getSpaceshipById(id);
    }

    @ApiOperation(value = "Search spaceships by name")
    @GetMapping("/search")
    public List<Spaceship> getSpaceshipsByName(@RequestParam String name) {
        return spaceshipService.getSpaceshipsByName(name);
    }

    @ApiOperation(value = "Add a new spaceship")
    @PostMapping
    public Spaceship createSpaceship(@RequestBody Spaceship spaceship) {
        return spaceshipService.createSpaceship(spaceship);
    }

    @ApiOperation(value = "Update a spaceship")
    @PutMapping("/{id}")
    public Spaceship updateSpaceship(@PathVariable Long id, @RequestBody Spaceship spaceship) {
        spaceship.setId(id);
        return spaceshipService.updateSpaceship(spaceship);
    }

    @ApiOperation(value = "Delete a spaceship")
    @DeleteMapping("/{id}")
    public void deleteSpaceship(@PathVariable Long id) {
        spaceshipService.deleteSpaceship(id);
    }
}
