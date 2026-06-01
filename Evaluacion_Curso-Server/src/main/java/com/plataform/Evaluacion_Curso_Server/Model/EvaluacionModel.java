package com.plataform.Evaluacion_Curso_Server.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="evaluacion-table")
public class EvaluacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEvaluacion;
    @Column(nullable = false)
    private Long asignacionCuAsEvalucion;
    @Column(nullable = false)
    private Long inscripcionEsCuEvaluacion;
    @Column(nullable = false)
    private String tituloEvaluacion;
    @Column(nullable = false)
    private float porcentajeEvaluacion;
    @Column(nullable = false)
    private LocalDate fechaSubidaEvaluacion;
    @Column(nullable = false)
    private float puntosEvaluacion;

    public EvaluacionModel() {}
    public EvaluacionModel(Long idEvaluacion, Long asignacionCuAsEvalucion, Long inscripcionEsCuEvaluacion, String tituloEvaluacion, float porcentajeEvaluacion, LocalDate fechaSubidaEvaluacion, float puntosEvaluacion) {
        this.idEvaluacion = idEvaluacion;
        this.asignacionCuAsEvalucion = asignacionCuAsEvalucion;
        this.inscripcionEsCuEvaluacion = inscripcionEsCuEvaluacion;
        this.tituloEvaluacion = tituloEvaluacion;
        this.porcentajeEvaluacion = porcentajeEvaluacion;
        this.fechaSubidaEvaluacion = fechaSubidaEvaluacion;
        this.puntosEvaluacion = puntosEvaluacion;
    }

    public Long getIdEvaluacion() {
        return idEvaluacion;
    }

    public void setIdEvaluacion(Long idEvaluacion) {
        this.idEvaluacion = idEvaluacion;
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
