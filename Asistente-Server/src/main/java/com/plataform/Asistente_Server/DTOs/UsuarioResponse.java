package com.plataform.Asistente_Server.DTOs;

public class UsuarioResponse {
    private String nombreUsuario;
    private String apellidoUsuario;
    private String dniUsuario;
    private String rolUsuario;
    private Boolean habilitadoUsuario;

    public UsuarioResponse() {}

    public UsuarioResponse(String nombreUsuario, String apellidoUsuario, String dniUsuario, String rolUsuario, Boolean habilitadoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.dniUsuario = dniUsuario;
        this.rolUsuario = rolUsuario;
        this.habilitadoUsuario = habilitadoUsuario;
    }

    public String getNombreUsuario() {return nombreUsuario;}
    public void setNombreUsuario(String nombreUsuario) {this.nombreUsuario = nombreUsuario;}

    public String getApellidoUsuario() {return apellidoUsuario;}
    public void setApellidoUsuario(String apellidoUsuario) {this.apellidoUsuario = apellidoUsuario;}

    public String getDniUsuario() {return dniUsuario;}
    public void setDniUsuario(String dniUsuario) {this.dniUsuario = dniUsuario;}

    public String getRolUsuario() {return rolUsuario;}
    public void setRolUsuario(String rolUsuario) {this.rolUsuario = rolUsuario;}

    public Boolean getHabilitadoUsuario() {return habilitadoUsuario;}
    public void setHabilitadoUsuario(Boolean habilitadoUsuario) {this.habilitadoUsuario = habilitadoUsuario;}
}
