/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Apasp
 */
package com.mycompany.spaceshipapi.repository;

import com.mycompany.spaceshipapi.entity.Spaceship;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SpaceshipRepository extends JpaRepository<Spaceship, Long> {
    List<Spaceship> findByNameContaining(String name);
}


