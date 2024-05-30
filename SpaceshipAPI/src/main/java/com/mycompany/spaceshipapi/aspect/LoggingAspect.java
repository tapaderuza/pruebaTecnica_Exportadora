/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Apasp
 */
package com.mycompany.spaceshipapi.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    @Before("execution(* com.mycompany.spaceshipapi.service.SpaceshipService.getSpaceshipById(..)) && args(id)")
    public void logBefore(Long id) {
        if (id < 0) {
            System.out.println("Attempted to retrieve spaceship with negative ID: " + id);
        }
    }
}


