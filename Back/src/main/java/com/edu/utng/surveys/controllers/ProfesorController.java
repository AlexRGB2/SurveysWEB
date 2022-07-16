package com.edu.utng.surveys.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edu.utng.surveys.models.ProfesorModel;
import com.edu.utng.surveys.services.ProfesorService;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {
    
    @Autowired
    ProfesorService profesorService;

    @GetMapping()
    public ArrayList<ProfesorModel> obtenerProfesor(){
        return profesorService.obtenerProfesor();
    }

    @PostMapping
    public ProfesorModel guardarProfesor(@RequestBody ProfesorModel profesor){
        return this.profesorService.guardarProfesor(profesor);
    }

    @GetMapping(path = "/{id}")
    public Optional <ProfesorModel> obtenerProfesorPorId(@PathVariable("id") Long id) {
        return this.profesorService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<ProfesorModel> obtenerNumEmpleado(@RequestParam("numEmpleado") Long numEmpleado){
        return this.profesorService.obtenerNumEmpleado(numEmpleado);
    }

    @DeleteMapping(path = "/{numEmpleado}")
    public String eliminarPorMatricula(@PathVariable("numEmpleado") Long numEmpleado){
        boolean ok = this.profesorService.eliminarProfesor(numEmpleado);
        if (ok) {
            return "Se elimino el usuario con matricula:" + numEmpleado;
        } else{
            return "No se pudo eliminar el usuario con matricula: " + numEmpleado;
        }
    }
}
