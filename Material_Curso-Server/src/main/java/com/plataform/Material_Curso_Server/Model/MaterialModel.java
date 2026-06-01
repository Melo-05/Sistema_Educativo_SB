package com.plataform.Material_Curso_Server.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "material_curso")
public class MaterialModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_material")
    private Long idMaterial;
    @Column(name = "asignacion_cu_as_id", nullable = false)
    private Long asignacionCuAsIdMaterial;
    @Column(name = "titulo_material", nullable = false, length = 200)
    private String tituloMaterial;
    @Column(name = "descripcion_material", length = 500)
    private String descripcionMaterial;
    @Column(name = "tipo_material", length = 100)
    private String tipoMaterial;
    @Column(name = "estado_material", length = 50)
    private Boolean estadoMaterial;
    @Column(name = "url_material", length = 300)
    private String urlMaterial;
    @Column(name = "fecha_subida")
    private LocalDate fechaSubidaMaterial;

    public MaterialModel() {}
    public MaterialModel(Long idMaterial, Long asignacionCuAsIdMaterial, String tituloMaterial, String descripcionMaterial, String tipoMaterial, Boolean estadoMaterial, String urlMaterial, LocalDate fechaSubidaMaterial) {
        this.idMaterial = idMaterial;
        this.asignacionCuAsIdMaterial = asignacionCuAsIdMaterial;
        this.tituloMaterial = tituloMaterial;
        this.descripcionMaterial = descripcionMaterial;
        this.tipoMaterial = tipoMaterial;
        this.estadoMaterial = estadoMaterial;
        this.urlMaterial = urlMaterial;
        this.fechaSubidaMaterial = fechaSubidaMaterial;
    }

    public Long getIdMaterial() {return idMaterial;}
    public void setIdMaterial(Long idMaterial) {this.idMaterial = idMaterial;}

    public Long getAsignacionCuAsIdMaterial() {return asignacionCuAsIdMaterial;}
    public void setAsignacionCuAsIdMaterial(Long asignacionCuAsIdMaterial) {this.asignacionCuAsIdMaterial = asignacionCuAsIdMaterial;}

    public String getTituloMaterial() {return tituloMaterial;}
    public void setTituloMaterial(String tituloMaterial) {this.tituloMaterial = tituloMaterial;}

    public String getDescripcionMaterial() {return descripcionMaterial;}
    public void setDescripcionMaterial(String descripcionMaterial) {this.descripcionMaterial = descripcionMaterial;}

    public String getTipoMaterial() {return tipoMaterial;}
    public void setTipoMaterial(String tipoMaterial) {this.tipoMaterial = tipoMaterial;}

    public Boolean getEstadoMaterial() {return estadoMaterial;}
    public void setEstadoMaterial(Boolean estadoMaterial) {this.estadoMaterial = estadoMaterial;}

    public String getUrlMaterial() {return urlMaterial;}
    public void setUrlMaterial(String urlMaterial) {this.urlMaterial = urlMaterial;}

    public LocalDate getFechaSubidaMaterial() {return fechaSubidaMaterial;}
    public void setFechaSubidaMaterial(LocalDate fechaSubidaMaterial) {this.fechaSubidaMaterial = fechaSubidaMaterial;}
}
