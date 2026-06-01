package com.plataform.Inscripcion_Estudiante_Curso_Server.DTO;

import java.time.LocalDate;

public class InscripcionRequestDTO {
    private Long estudianteIdInscripcion;
    private Long asignacionIdInscripcion;
    private LocalDate fechaInscripcion;
    private float totalPuntosInscripcion;

    public InscripcionRequestDTO() {}
    public InscripcionRequestDTO(Long estudianteIdInscripcion,Long asignacionIdInscripcion, LocalDate fechaInscripcion, float totalPuntosInscripcion) {
        this.estudianteIdInscripcion = estudianteIdInscripcion;
        this.asignacionIdInscripcion=  asignacionIdInscripcion;
        this.fechaInscripcion = fechaInscripcion;
        this.totalPuntosInscripcion = totalPuntosInscripcion;
    }

    public Long getEstudianteIdInscripcion() {return estudianteIdInscripcion;}
    public void setEstudianteIdInscripcion(Long estudianteIdInscripcion) {this.estudianteIdInscripcion = estudianteIdInscripcion;}

    public Long getAsignacionIdInscripcion() {return asignacionIdInscripcion;}
    public void setAsignacionIdInscripcion(Long asignacionIdInscripcion) {this.asignacionIdInscripcion = asignacionIdInscripcion;}

    public LocalDate getFechaInscripcion() {return fechaInscripcion;}
    public void setFechaInscripcion(LocalDate fechaInscripcion) {this.fechaInscripcion = fechaInscripcion;}

    public float getTotalPuntosInscripcion() {return totalPuntosInscripcion;}
    public void setTotalPuntosInscripcion(float totalPuntosInscripcion) {this.totalPuntosInscripcion = totalPuntosInscripcion;}
}
