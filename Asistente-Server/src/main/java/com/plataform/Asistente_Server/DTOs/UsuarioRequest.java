package com.plataform.Asistente_Server.DTOs;
import com.plataform.Asistente_Server.Models.RolesModel;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UsuarioRequest {
    @NotBlank(message = "El nombre es obligatorio")
    private String nombreUsuario;
    @NotBlank(message = "El apellido es obligatorio")
    private String apellidoUsuario;
    @NotBlank(message = "El DNI es obligatorio")
    @Size(min = 8, max = 8, message = "El DNI debe tener 8 caracteres")
    private String dniUsuario;
    @NotNull(message = "El rol es obligatorio")
    private RolesModel rolUsuario;
    @NotNull(message = "El habilitado es obligatorio")
    private Boolean habilitadoUsuario;
    @NotBlank(message = "El correo es obligatorio")
    private String correoUsuario;

    public UsuarioRequest() {}

    public UsuarioRequest(String nombreUsuario, String apellidoUsuario, String dniUsuario, RolesModel rolUsuario, Boolean habilitadoUsuario, String correoUsuario) {
        this.nombreUsuario = nombreUsuario;
        this.apellidoUsuario = apellidoUsuario;
        this.dniUsuario = dniUsuario;
        this.rolUsuario = rolUsuario;
        this.habilitadoUsuario = habilitadoUsuario;
        this.correoUsuario = correoUsuario;
    }

    public String getNombreUsuario() {return nombreUsuario;}
    public void setNombreUsuario(String nombreUsuario) {this.nombreUsuario = nombreUsuario;}

    public String getApellidoUsuario() {return apellidoUsuario;}
    public void setApellidoUsuario(String apellidoUsuario) {this.apellidoUsuario = apellidoUsuario;}

    public String getDniUsuario() {return dniUsuario;}
    public void setDniUsuario(String dniUsuario) {this.dniUsuario = dniUsuario;}

    public RolesModel getRolUsuario() {return rolUsuario;}
    public void setRolUsuario(RolesModel rolUsuario) {this.rolUsuario = rolUsuario;}

    public Boolean getHabilitadoUsuario() {return habilitadoUsuario;}
    public void setHabilitadoUsuario(Boolean habilitadoUsuario) {this.habilitadoUsuario = habilitadoUsuario;}

    public String getCorreoUsuario() {return correoUsuario;}
    public void setCorreoUsuario(String correoUsuario) {this.correoUsuario = correoUsuario;}
}
