package com.plataform.Asignacion_Curso_Asistente_Server.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsuarioClientDTO {
    @JsonProperty("nombreUsuario")
    private String nombreUsuario;
    @JsonProperty("apellidoUsuario")
    private String apellidoUsuario;
    @JsonProperty("dniUsuario")
    private String dniUsuario;
    @JsonProperty("correoUsuario")
    private String correoUsuario;
    @JsonProperty("habilitadoUsuario")
    private Boolean habilitadoUsuario;
    @JsonProperty("rolesUsuario")
    private String rolesUsuario;

    public UsuarioClientDTO() {}
    public UsuarioClientDTO(String nombreUsuario, String apellidoUsuario, String dniUsuario, String correoUsuario, Boolean habilitadoUsuario, String rolesUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.dniUsuario = dniUsuario;
        this.correoUsuario = correoUsuario;
        this.habilitadoUsuario = habilitadoUsuario;
        this.rolesUsuario = rolesUsuario;
    }

    public String getNombreUsuario() {return nombreUsuario;}
    public void setNombreUsuario(String nombreUsuario) {this.nombreUsuario = nombreUsuario;}

    public String getApellidoUsuario() {return apellidoUsuario;}
    public void setApellidoUsuario(String apellidoUsuario) {this.apellidoUsuario = apellidoUsuario;}

    public String getDniUsuario() {return dniUsuario;}
    public void setDniUsuario(String dniUsuario) {this.dniUsuario = dniUsuario;}

    public String getCorreoUsuario() {return correoUsuario;}
    public void setCorreoUsuario(String correoUsuario) {this.correoUsuario = correoUsuario;}

    public Boolean getHabilitadoUsuario() {return habilitadoUsuario;}
    public void setHabilitadoUsuario(Boolean habilitadoUsuario) {this.habilitadoUsuario = habilitadoUsuario;}

    public String getRolesUsuario() {return rolesUsuario;}
    public void setRolesUsuario(String rolesUsuario) {this.rolesUsuario = rolesUsuario;}
}
