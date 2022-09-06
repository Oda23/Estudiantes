/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.guiapractica.service;

import com.example.guiapractica.model.estudiante;
import com.example.guiapractica.repository.Estudianterepository;
import java.io.Serializable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

/**
 *
 * @author Odalis
 */
@Service
public class EstudianteServiceImpl extends GenericaServiceImpl<estudiante, Long> implements EstudianteService{

   @Autowired
    Estudianterepository estudianterepository;
    
    @Override
    public CrudRepository<estudiante, Long> getDao() {
        return estudianterepository;
    }
    
}
