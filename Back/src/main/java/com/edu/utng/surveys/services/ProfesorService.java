package com.edu.utng.surveys.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.utng.surveys.models.ProfesorModel;
import com.edu.utng.surveys.repositories.ProfesorRepository;

@Service
public class ProfesorService {
    @Autowired
    ProfesorRepository profesorRepository;

    public ArrayList<ProfesorModel> obtenerProfesor(){
        return (ArrayList<ProfesorModel>)profesorRepository.findAll();
    }

    public ProfesorModel guardarProfesor (ProfesorModel alumno){
        return profesorRepository.save(alumno);
    }

    public Optional<ProfesorModel> obtenerPorId(Long id){
        return profesorRepository.findById(id);
    }

    public ArrayList<ProfesorModel> obtenerNumEmpleado(Long numEpleado){
        return profesorRepository.findByNumEmpleado(numEpleado);
    }

    public boolean eliminarProfesor(Long id){
        try{
            profesorRepository.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
}
