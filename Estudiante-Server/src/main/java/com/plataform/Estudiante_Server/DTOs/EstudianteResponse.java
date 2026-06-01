package com.plataform.Estudiante_Server.DTOs;

import com.plataform.Estudiante_Server.Models.EstudianteModel;

public class EstudianteResponse {
    private Long idEstudiante;
    private String nombreEstudiante;
    private String apellidoEstudiante;
    private String dniEstudiante;
    private String correoEstudiante;

    public EstudianteResponse() {}

    public EstudianteResponse(Long idEstudiante,String nombreEstudiante, String apellidoEstudiante, String dniEstudiante, String correoEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.dniEstudiante = dniEstudiante;
        this.correoEstudiante = correoEstudiante;
    }

    public String getCorreoEstudiante() {
        return correoEstudiante;
    }

    public void setCorreoEstudiante(String correoEstudiante) {
        this.correoEstudiante = correoEstudiante;
    }

    public String getDniEstudiante() {
        return dniEstudiante;
    }

    public void setDniEstudiante(String dniEstudiante) {
        this.dniEstudiante = dniEstudiante;
    }

    public String getApellidoEstudiante() {
        return apellidoEstudiante;
    }

    public void setApellidoEstudiante(String apellidoEstudiante) {
        this.apellidoEstudiante = apellidoEstudiante;
    }

    public String getNombreEstudiante() {
        return nombreEstudiante;
    }

    public void setNombreEstudiante(String nombreEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
    }

    public Long getIdEstudiante() {
        return idEstudiante;
    }

    public void setIdEstudiante(Long idEstudiante) {
        this.idEstudiante = idEstudiante;
    }
}
