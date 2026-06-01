package com.plataform.Asignacion_Curso_Asistente_Server.DTO;

public class AsignacionRequestDTO {
    private Long asistenteIdAsignacion;
    private Long cursoIdAsignacion;

    public AsignacionRequestDTO() {}
    public AsignacionRequestDTO(Long asistenteIdAsignacion, Long cursoIdAsignacion) {
        this.asistenteIdAsignacion = asistenteIdAsignacion;
        this.cursoIdAsignacion = cursoIdAsignacion;
    }

    public Long getAsistenteIdAsignacion() {return asistenteIdAsignacion;}
    public void setAsistenteIdAsignacion(Long asistenteIdAsignacion) {this.asistenteIdAsignacion = asistenteIdAsignacion;}

    public Long getCursoIdAsignacion() {return cursoIdAsignacion;}
    public void setCursoIdAsignacion(Long cursoIdAsignacion) {this.cursoIdAsignacion = cursoIdAsignacion;}
}
