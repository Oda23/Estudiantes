/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.guiapractica.controller;

import com.example.guiapractica.model.estudiante;
import com.example.guiapractica.service.EstudianteService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Odalis
 */
@RestController
 @RequestMapping("/api/estudiante")
public class EstudianteController {
    @Autowired
    EstudianteService estudianteservice;
    
    @GetMapping("/lista")
    public ResponseEntity<List<estudiante>> listar() {
       
        return new ResponseEntity<>(estudianteservice.findByAll(), HttpStatus.OK);
    }
    
     @PostMapping("/crear")
    public ResponseEntity<estudiante> crear(@RequestBody estudiante c) {
        return new ResponseEntity<>(estudianteservice.save(c), HttpStatus.CREATED);
    }
    
     @DeleteMapping("/eliminar/{id}")
    public ResponseEntity<estudiante> eliminar(@PathVariable Long id) {
       estudianteservice.delete(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
     @GetMapping("/buscar/{id}")
    public ResponseEntity<estudiante> buscar(@PathVariable Long id) {
        return new ResponseEntity<>(estudianteservice.findById(id), HttpStatus.OK);
    }
    @PutMapping("/actualizar/{id}")
    public ResponseEntity<estudiante> actualizar(@PathVariable Long id, @RequestBody estudiante u) {
        estudiante estudiante1 = buscarpersona(id);
        if (estudiante1 == null) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

        } else {
            try {
                estudiante1.setNombre(u.getNombre());
                estudiante1.setNúmero(u.getNúmero());
                estudiante1.setCursoLista(u.getCursoLista());
                estudiante1.setGpa(u.getGpa());
              
                return new ResponseEntity<>(estudianteservice.save(u), HttpStatus.CREATED);
            } catch (Exception e) {
                return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
           
        }

    }
    
    
    
      public estudiante buscarpersona(@PathVariable Long id) {
        return estudianteservice.findById(id);
    }
    
}
