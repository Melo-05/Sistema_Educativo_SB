package com.plataform.Evaluacion_Curso_Server.DTOs;

import java.time.LocalDate;

public class InscripcionClientDTO {
    private Long idInscripcion;
    private EstudianteClientDTO estudianteIdInscripcion;
    private Long asignacionIdInscripcion;
    private LocalDate fechaInscripcion;
    private float totalPuntosInscripcion;

    public InscripcionClientDTO() {}
    public InscripcionClientDTO(Long idInscripcion, EstudianteClientDTO estudianteIdInscripcion, Long asignacionIdInscripcion, LocalDate fechaInscripcion, float totalPuntosInscripcion) {
        this.idInscripcion = idInscripcion;
        this.estudianteIdInscripcion = estudianteIdInscripcion;
        this.asignacionIdInscripcion = asignacionIdInscripcion;
        this.fechaInscripcion = fechaInscripcion;
        this.totalPuntosInscripcion = totalPuntosInscripcion;
    }

    public Long getIdInscripcion() {
        return idInscripcion;
    }

    public void setIdInscripcion(Long idInscripcion) {
        this.idInscripcion = idInscripcion;
    }

    public EstudianteClientDTO getEstudianteIdInscripcion() {
        return estudianteIdInscripcion;
    }

    public void setEstudianteIdInscripcion(EstudianteClientDTO estudianteIdInscripcion) {
        this.estudianteIdInscripcion = estudianteIdInscripcion;
    }

    public Long getAsignacionIdInscripcion() {
        return asignacionIdInscripcion;
    }

    public void setAsignacionIdInscripcion(Long asignacionIdInscripcion) {
        this.asignacionIdInscripcion = asignacionIdInscripcion;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public float getTotalPuntosInscripcion() {
        return totalPuntosInscripcion;
    }

    public void setTotalPuntosInscripcion(float totalPuntosInscripcion) {
        this.totalPuntosInscripcion = totalPuntosInscripcion;
    }
}
