package com.plataform.Inscripcion_Estudiante_Curso_Server.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EstudianteClientDTO {
    @JsonProperty("nombreEstudiante")
    private String nombreEstudiante;
    @JsonProperty("apellidoEstudiante")
    private String apellidoEstudiante;
    @JsonProperty("dniEstudiante")
    private int dniEstudiante;
    @JsonProperty("correoEstudiante")
    private String correoEstudiante;
    @JsonProperty("habilitadoEstudiante")
    private Boolean habilitadoEstudiante;
    @JsonProperty("rolEstudiante")
    private String rolEstudiante;

    public EstudianteClientDTO() {}
    public EstudianteClientDTO(String nombreEstudiante, String apellidoEstudiante, int dniEstudiante, String correoEstudiante, Boolean habilitadoEstudiante, String rolEstudiante) {
        this.nombreEstudiante = nombreEstudiante;
        this.apellidoEstudiante = apellidoEstudiante;
        this.dniEstudiante = dniEstudiante;
        this.correoEstudiante = correoEstudiante;
        this.habilitadoEstudiante = habilitadoEstudiante;
        this.rolEstudiante = rolEstudiante;
    }

    public String getNombreEstudiante() {return nombreEstudiante;}
    public void setNombreEstudiante(String nombreEstudiante) {this.nombreEstudiante = nombreEstudiante;}

    public String getApellidoEstudiante() {return apellidoEstudiante;}
    public void setApellidoEstudiante(String apellidoEstudiante) {this.apellidoEstudiante = apellidoEstudiante;}

    public int getDniEstudiante() {return dniEstudiante;}
    public void setDniEstudiante(int dniEstudiante) {this.dniEstudiante = dniEstudiante;}

    public String getCorreoEstudiante() {return correoEstudiante;}
    public void setCorreoEstudiante(String correoEstudiante) {this.correoEstudiante = correoEstudiante;}

    public Boolean getHabilitadoEstudiante() {return habilitadoEstudiante;}
    public void setHabilitadoEstudiante(Boolean habilitadoEstudiante) {this.habilitadoEstudiante = habilitadoEstudiante;}

    public String getRolEstudiante() {return rolEstudiante;}
    public void setRolEstudiante(String rolEstudiante) {this.rolEstudiante = rolEstudiante;}
}
