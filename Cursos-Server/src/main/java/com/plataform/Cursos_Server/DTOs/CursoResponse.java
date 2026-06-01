package com.plataform.Cursos_Server.DTOs;

public class CursoResponse {
    private String nombreCurso;
    private String descripcionCurso;
    private Integer creditosCurso;

    public CursoResponse() {}

    public CursoResponse(String nombreCurso, String descripcionCurso, Integer creditosCurso) {
        this.nombreCurso = nombreCurso;
        this.descripcionCurso = descripcionCurso;
        this.creditosCurso = creditosCurso;
    }

    public String getNombreCurso() {return nombreCurso;}
    public void setNombreCurso(String nombreCurso) {this.nombreCurso = nombreCurso;}

    public String getDescripcionCurso() {return descripcionCurso;}
    public void setDescripcionCurso(String descripcionCurso) {this.descripcionCurso = descripcionCurso;}

    public Integer getCreditosCurso() {return creditosCurso;}
    public void setCreditosCurso(Integer creditosCurso) {this.creditosCurso = creditosCurso;}
}
