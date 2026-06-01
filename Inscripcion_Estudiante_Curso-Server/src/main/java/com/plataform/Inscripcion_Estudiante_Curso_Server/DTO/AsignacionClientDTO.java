package com.plataform.Inscripcion_Estudiante_Curso_Server.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class AsignacionClientDTO {
    @JsonProperty("idAsignacion")
    private Long idAsignacion;
    @JsonProperty("asistente")
    private Long asistente;
    @JsonProperty("curso")
    private Long curso;
    @JsonProperty("fechaAsignacion")
    private LocalDate fechaAsignacion;

    public AsignacionClientDTO() {}
    public AsignacionClientDTO(Long idAsignacion, Long asistente, Long curso, LocalDate fechaAsignacion) {
        this.idAsignacion = idAsignacion;
        this.asistente = asistente;
        this.curso = curso;
        this.fechaAsignacion = fechaAsignacion;
    }

    public Long getIdAsignacion() {
        return idAsignacion;
    }

    public void setIdAsignacion(Long idAsignacion) {
        this.idAsignacion = idAsignacion;
    }

    public Long getAsistente() {
        return asistente;
    }

    public void setAsistente(Long asistente) {
        this.asistente = asistente;
    }

    public Long getCurso() {
        return curso;
    }

    public void setCurso(Long curso) {
        this.curso = curso;
    }

    public LocalDate getFechaAsignacion() {
        return fechaAsignacion;
    }

    public void setFechaAsignacion(LocalDate fechaAsignacion) {
        this.fechaAsignacion = fechaAsignacion;
    }
}
