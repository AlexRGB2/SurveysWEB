package com.edu.utng.surveys.models;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="encuesta")
public class EncuestaModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long idEncuesta;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private int numPreguntas;

    @Column(nullable = false)
    private String pregunta;

    @Column(nullable = false)
    private int cuatrimestre;

    @Column(nullable = false)
    private Date fechaCreac;

    public Date getFechaCreac() {
        return fechaCreac;
    }

    public void setFechaCreac(Date fechaCreac) {
        this.fechaCreac = fechaCreac;
    }

    public Long getNumEncuesta() {
        return idEncuesta;
    }

    public void setNumEncuesta(Long numEncuesta) {
        this.idEncuesta = numEncuesta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumPreguntas() {
        return numPreguntas;
    }

    public void setNumPreguntas(int numPreguntas) {
        this.numPreguntas = numPreguntas;
    }

    public int getCuatrimestre() {
        return cuatrimestre;
    }

    public void setCuatrimestre(int cuatrimestre) {
        this.cuatrimestre = cuatrimestre;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }

}
