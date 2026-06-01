package com.plataform.Inscripcion_Estudiante_Curso_Server.Model;
import jakarta.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name="inscripcion_es_cu")
public class InscripcionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idInscripcion;
    @Column(nullable = false)
    private Long estudianteIdInscripcion;
    @Column(nullable = false)
    private Long asignacionIdInscripcion;
    @Column(nullable = false)
    private LocalDate fechaInscripcion;
    @Column(nullable = false)
    private float totalPuntosInscripcion;

    public InscripcionModel() {}
    public InscripcionModel(Long idInscripcion, Long estudianteIdInscripcion, Long asignacionIdInscripcion, LocalDate fechaInscripcion, float totalPuntosInscripcion) {
        this.idInscripcion = idInscripcion;
        this.estudianteIdInscripcion = estudianteIdInscripcion;
        this.asignacionIdInscripcion = asignacionIdInscripcion;
        this.fechaInscripcion = fechaInscripcion;
        this.totalPuntosInscripcion = totalPuntosInscripcion;
    }

    public Long getIdInscripcion() {return idInscripcion;}
    public void setIdInscripcion(Long idInscripcion) {this.idInscripcion = idInscripcion;}

    public Long getEstudianteIdInscripcion() {return estudianteIdInscripcion;}
    public void setEstudianteIdInscripcion(Long estudianteIdInscripcion) {this.estudianteIdInscripcion = estudianteIdInscripcion;}

    public Long getAsignacionIdInscripcion() {return asignacionIdInscripcion;}
    public void setAsignacionIdInscripcion(Long asignacionIdInscripcion) {this.asignacionIdInscripcion = asignacionIdInscripcion;}

    public LocalDate getFechaInscripcion() {return fechaInscripcion;}
    public void setFechaInscripcion(LocalDate fechaInscripcion) {this.fechaInscripcion = fechaInscripcion;}

    public float getTotalPuntosInscripcion() {return totalPuntosInscripcion;}
    public void setTotalPuntosInscripcion(float totalPuntosInscripcion) {this.totalPuntosInscripcion = totalPuntosInscripcion;}
}
