package com.edu.utng.surveys.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edu.utng.surveys.models.EncuestaModel;

@Repository
public interface EncuestaRepository extends CrudRepository<EncuestaModel, Long> {
    public abstract ArrayList<EncuestaModel> findByIdEncuesta(Long idEncuesta);
}
