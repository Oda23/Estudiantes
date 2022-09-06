/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.guiapractica.repository;

import com.example.guiapractica.model.estudiante;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Odalis
 */
public interface Estudianterepository extends MongoRepository<estudiante, Long> {
    
}
