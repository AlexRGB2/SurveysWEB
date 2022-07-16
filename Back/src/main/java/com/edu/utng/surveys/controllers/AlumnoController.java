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
import com.edu.utng.surveys.models.AlumnoModel;
import com.edu.utng.surveys.services.AlumnoService;

@RestController
@RequestMapping("/alumno")
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;

    @GetMapping()
    public ArrayList<AlumnoModel> obtenerAlumno(){
        return alumnoService.obtenerAlumno();
    }

    @PostMapping
    public AlumnoModel guardarAlumno(@RequestBody AlumnoModel alumno){
        return this.alumnoService.guardarAlumno(alumno);
    }

    @GetMapping(path = "/{id}")
    public Optional <AlumnoModel> obtenerAlumnoPorId(@PathVariable("id") Long id) {
        return this.alumnoService.obtenerPorId(id);
    }

    @GetMapping("/query")
    public ArrayList<AlumnoModel> obtenerPorMatricula(@RequestParam("matricula") Long matricula){
        return this.alumnoService.obtenerPorMatricula(matricula);
    }

    @DeleteMapping(path = "/{matricula}")
    public String eliminarPorMatricula(@PathVariable("matricula") Long matricula){
        boolean ok = this.alumnoService.eliminarAlumno(matricula);
        if (ok) {
            return "Se elimino el usuario con matricula:" + matricula;
        } else{
            return "No se pudo eliminar el usuario con matricula: " + matricula;
        }
    }
}