package com.plataform.Evaluacion_Curso_Server.DTOs;

import java.time.LocalDate;

public class EvaluacionRequest {
    private Long asignacionCuAsEvalucion;
    private Long inscripcionEsCuEvaluacion;
    private String tituloEvaluacion;
    private float porcentajeEvaluacion;
    private LocalDate fechaSubidaEvaluacion;
    private float puntosEvaluacion;

    public EvaluacionRequest() {}
    public EvaluacionRequest(Long asignacionCuAsEvalucion, Long inscripcionEsCuEvaluacion, String tituloEvaluacion, float porcentajeEvaluacion, LocalDate fechaSubidaEvaluacion, float puntosEvaluacion) {
        this.asignacionCuAsEvalucion = asignacionCuAsEvalucion;
        this.inscripcionEsCuEvaluacion = inscripcionEsCuEvaluacion;
        this.tituloEvaluacion = tituloEvaluacion;
        this.porcentajeEvaluacion = porcentajeEvaluacion;
        this.fechaSubidaEvaluacion = fechaSubidaEvaluacion;
        this.puntosEvaluacion = puntosEvaluacion;
    }

    public Long getAsignacionCuAsEvalucion() {
        return asignacionCuAsEvalucion;
    }

    public void setAsignacionCuAsEvalucion(Long asignacionCuAsEvalucion) {
        this.asignacionCuAsEvalucion = asignacionCuAsEvalucion;
    }

    public Long getInscripcionEsCuEvaluacion() {
        return inscripcionEsCuEvaluacion;
    }

    public void setInscripcionEsCuEvaluacion(Long inscripcionEsCuEvaluacion) {
        this.inscripcionEsCuEvaluacion = inscripcionEsCuEvaluacion;
    }

    public String getTituloEvaluacion() {
        return tituloEvaluacion;
    }

    public void setTituloEvaluacion(String tituloEvaluacion) {
        this.tituloEvaluacion = tituloEvaluacion;
    }

    public float getPorcentajeEvaluacion() {
        return porcentajeEvaluacion;
    }

    public void setPorcentajeEvaluacion(float porcentajeEvaluacion) {
        this.porcentajeEvaluacion = porcentajeEvaluacion;
    }

    public LocalDate getFechaSubidaEvaluacion() {
        return fechaSubidaEvaluacion;
    }

    public void setFechaSubidaEvaluacion(LocalDate fechaSubidaEvaluacion) {
        this.fechaSubidaEvaluacion = fechaSubidaEvaluacion;
    }

    public float getPuntosEvaluacion() {
        return puntosEvaluacion;
    }

    public void setPuntosEvaluacion(float puntosEvaluacion) {
        this.puntosEvaluacion = puntosEvaluacion;
    }
}
