package com.plataform.Evaluacion_Curso_Server.DTOs;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public class AsignacionClientDTO {
    @JsonProperty("asistenteIdAsignacion")
    private UsuarioClientDTO  asistenteIdAsignacion;
    @JsonProperty("cursoIdAsignacion")
    private CursoClientDTO  cursoIdAsignacion;
    @JsonProperty("fechaAsignacion")
    private LocalDate fechaAsignacion;

    public AsignacionClientDTO() {}
    public AsignacionClientDTO(UsuarioClientDTO asistenteIdAsignacion, CursoClientDTO cursoIdAsignacion,LocalDate fechaAsignacion) {
        this.asistenteIdAsignacion = asistenteIdAsignacion;
        this.cursoIdAsignacion = cursoIdAsignacion;
        this.fechaAsignacion = fechaAsignacion;
    }

    public UsuarioClientDTO getAsistenteIdAsignacion() {return asistenteIdAsignacion;}
    public void setAsistenteIdAsignacion(UsuarioClientDTO asistenteIdAsignacion) {this.asistenteIdAsignacion = asistenteIdAsignacion;}

    public CursoClientDTO getCursoIdAsignacion() {return cursoIdAsignacion;}
    public void setCursoIdAsignacion(CursoClientDTO cursoIdAsignacion) {this.cursoIdAsignacion = cursoIdAsignacion;}

    public LocalDate getFechaAsignacion() {return fechaAsignacion;}
    public void setFechaAsignacion(LocalDate fechaAsignacion) {this.fechaAsignacion = fechaAsignacion;}
}
