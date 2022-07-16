package com.edu.utng.surveys.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.edu.utng.surveys.models.ProfesorModel;

@Repository
public interface ProfesorRepository extends CrudRepository<ProfesorModel, Long> {
    public abstract ArrayList<ProfesorModel> findByNumEmpleado(Long numEmpleado);
}
