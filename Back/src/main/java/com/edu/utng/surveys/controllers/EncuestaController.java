package com.edu.utng.surveys.controllers;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edu.utng.surveys.models.EncuestaModel;
import com.edu.utng.surveys.services.EncuestaService;

@RestController
@RequestMapping("/encuesta")
public class EncuestaController {
    @Autowired
    EncuestaService encuestaService;
    
    @GetMapping()
    public ArrayList<EncuestaModel> obtenerEncuesta(){
        return encuestaService.obtenerEncuesta();
    }

    @PostMapping
    public EncuestaModel guardarEncuesta(@RequestBody EncuestaModel encuesta){
        return this.encuestaService.guardarEncuesta(encuesta);
    }

    @GetMapping("/query")
    public ArrayList<EncuestaModel> obtenerPorId(@RequestParam("idEncuesta") Long idEncuesta){
        return this.encuestaService.obtenerPorId(idEncuesta);
    }
}
