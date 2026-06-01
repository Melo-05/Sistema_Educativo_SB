package com.plataform.Asignacion_Curso_Asistente_Server.Model;
import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name="asignacion_cu_as")
public class AsignacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAsignacion;
    @Column(nullable = false)
    private Long asistenteIdAsignacion;
    @Column(nullable = false)
    private Long cursoIdAsignacion;
    @Column(nullable = false)
    private LocalDate fechaAsignacion;

    public AsignacionModel() {}
    public AsignacionModel(Long idAsignacion, Long asistenteIdAsignacion, Long cursoIdAsignacion, LocalDate fechaAsignacion) {
        this.idAsignacion = idAsignacion;
        this.asistenteIdAsignacion = asistenteIdAsignacion;
        this.cursoIdAsignacion = cursoIdAsignacion;
        this.fechaAsignacion = fechaAsignacion;
    }

    public Long getIdAsignacion() {return idAsignacion;}
    public void setIdAsignacion(Long idAsignacion) {this.idAsignacion = idAsignacion;}

    public Long getAsistenteIdAsignacion() {return asistenteIdAsignacion;}
    public void setAsistenteIdAsignacion(Long asistenteIdAsignacion) {this.asistenteIdAsignacion = asistenteIdAsignacion;}

    public Long getCursoIdAsignacion() {return cursoIdAsignacion;}
    public void setCursoIdAsignacion(Long cursoIdAsignacion) {this.cursoIdAsignacion = cursoIdAsignacion;}

    public LocalDate getFechaAsignacion() {return fechaAsignacion;}
    public void setFechaAsignacion(LocalDate fechaAsignacion) {this.fechaAsignacion = fechaAsignacion;}
}
