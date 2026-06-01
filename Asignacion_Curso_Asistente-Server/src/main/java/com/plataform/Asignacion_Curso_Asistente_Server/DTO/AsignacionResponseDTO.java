package com.plataform.Asignacion_Curso_Asistente_Server.DTO;

import java.time.LocalDate;

public class AsignacionResponseDTO {
    private Long idAsignacion;
    private UsuarioClientDTO asistenteIdAsignacion;
    private CursoClientDTO cursoIdAsignacion;
    private LocalDate fechaAsignacion;

    public AsignacionResponseDTO() {}

    public AsignacionResponseDTO(Long idAsignacion, UsuarioClientDTO asistenteIdAsignacion, CursoClientDTO cursoIdAsignacion, LocalDate fechaAsignacion) {
        this.idAsignacion = idAsignacion;
        this.asistenteIdAsignacion = asistenteIdAsignacion;
        this.cursoIdAsignacion = cursoIdAsignacion;
        this.fechaAsignacion = fechaAsignacion;
    }

    public Long getIdAsignacion() {return idAsignacion;}
    public void setIdAsignacion(Long idAsignacion) {this.idAsignacion = idAsignacion;}

    public UsuarioClientDTO getAsistenteIdAsignacion() {return asistenteIdAsignacion;}
    public void setAsistenteIdAsignacion(UsuarioClientDTO asistenteIdAsignacion) {this.asistenteIdAsignacion = asistenteIdAsignacion;}

    public CursoClientDTO getCursoIdAsignacion() {return cursoIdAsignacion;}
    public void setCursoIdAsignacion(CursoClientDTO cursoIdAsignacion) {this.cursoIdAsignacion = cursoIdAsignacion;}

    public LocalDate getFechaAsignacion() {return fechaAsignacion;}
    public void setFechaAsignacion(LocalDate fechaAsignacion) {this.fechaAsignacion = fechaAsignacion;}
}
