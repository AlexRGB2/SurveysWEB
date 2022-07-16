package com.edu.utng.surveys.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.utng.surveys.models.AlumnoModel;
import com.edu.utng.surveys.repositories.AlumnoRepository;

@Service
public class AlumnoService {
    @Autowired
    AlumnoRepository alumnoRepository;

    public ArrayList<AlumnoModel> obtenerAlumno(){
        return (ArrayList<AlumnoModel>)alumnoRepository.findAll();
    }

    public AlumnoModel guardarAlumno (AlumnoModel alumno){
        return alumnoRepository.save(alumno);
    }

    public Optional<AlumnoModel> obtenerPorId(Long id){
        return alumnoRepository.findById(id);
    }

    public ArrayList<AlumnoModel> obtenerPorMatricula(Long matricula){
        return alumnoRepository.findByMatricula(matricula);
    }

    public boolean eliminarAlumno(Long matricula){
        try{
            alumnoRepository.deleteById(matricula);
            return true;
        } catch(Exception err){
            return false;
        }
    }
}
