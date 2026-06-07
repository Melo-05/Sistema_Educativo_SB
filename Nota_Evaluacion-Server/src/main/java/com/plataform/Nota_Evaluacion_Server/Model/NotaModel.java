package com.plataform.Nota_Evaluacion_Server.Model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "nota")
public class NotaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idNota;

    private Long evaluacionIdNota;
    private float valorNota;
    private LocalDate fechaNota;

    // getters y setters
    public Long getIdNota() { return idNota; }
    public void setIdNota(Long idNota) { this.idNota = idNota; }

    public Long getEvaluacionIdNota() { return evaluacionIdNota; }
    public void setEvaluacionIdNota(Long evaluacionIdNota) { this.evaluacionIdNota = evaluacionIdNota; }

    public float getValorNota() { return valorNota; }
    public void setValorNota(float valorNota) { this.valorNota = valorNota; }

    public LocalDate getFechaNota() { return fechaNota; }
    public void setFechaNota(LocalDate fechaNota) { this.fechaNota = fechaNota; }
}
