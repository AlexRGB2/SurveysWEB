package com.edu.utng.surveys.services;

import java.util.ArrayList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.utng.surveys.models.EncuestaModel;
import com.edu.utng.surveys.repositories.EncuestaRepository;

@Service
public class EncuestaService {
    @Autowired
    EncuestaRepository encuestaRepository;

    public ArrayList<EncuestaModel> obtenerEncuesta(){
        return (ArrayList<EncuestaModel>)encuestaRepository.findAll();
    }

    public EncuestaModel guardarEncuesta (EncuestaModel encuesta){
        return encuestaRepository.save(encuesta);
    }

    public ArrayList<EncuestaModel> obtenerPorId(Long id){
        return encuestaRepository.findByIdEncuesta(id);
    }

    public boolean eliminarEncuesta(Long id){
        try{
            encuestaRepository.deleteById(id);
            return true;
        } catch(Exception err){
            return false;
        }
    }
}
