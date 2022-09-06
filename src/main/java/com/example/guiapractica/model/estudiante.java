/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.guiapractica.model;

import java.util.ArrayList;
import org.springframework.data.annotation.Id;

/**
 *
 * @author Odalis
 */
public class estudiante {
    @Id
    public Long _id;
    
    public String nombre;
    public String número;
    public String correo;
    ArrayList cursoLista; 
    public String gpa; 

    public estudiante(Long _id, String nombre, String número, String correo, ArrayList cursoLista, String gpa) {
        this._id = _id;
        this.nombre = nombre;
        this.número = número;
        this.correo = correo;
        this.cursoLista = cursoLista;
        this.gpa = gpa;
    }


    public estudiante() {
    }

    public Long getId() {
        return _id;
    }

    public void setId(Long _id) {
        this._id = _id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNúmero() {
        return número;
    }

    public void setNúmero(String número) {
        this.número = número;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public ArrayList getCursoLista() {
        return cursoLista;
    }

    public void setCursoLista(ArrayList cursoLista) {
        this.cursoLista = cursoLista;
    }

 
    public String getGpa() {
        return gpa;
    }

    public void setGpa(String gpa) {
        this.gpa = gpa;
    }
    
    
    
}
