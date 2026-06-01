package com.plataform.Material_Curso_Server.DTO;

import java.time.LocalDate;

public class MaterialResponseDTO {
    private Long idMaterial;
    private AsignacionClientDTO asignacionCuAsIdMaterial;
    private String tituloMaterial;
    private String descripcionMaterial;
    private String tipoMaterial;
    private Boolean estadoMaterial;
    private String urlMaterial;
    private LocalDate fechaSubidaMaterial;

    public MaterialResponseDTO() {}

    public MaterialResponseDTO(Long idMaterial, AsignacionClientDTO asignacionCuAsIdMaterial, String tituloMaterial, String descripcionMaterial, String tipoMaterial, Boolean estadoMaterial, String urlMaterial, LocalDate fechaSubidaMaterial) {
        this.idMaterial = idMaterial;
        this.asignacionCuAsIdMaterial = asignacionCuAsIdMaterial;
        this.tituloMaterial = tituloMaterial;
        this.descripcionMaterial = descripcionMaterial;
        this.tipoMaterial = tipoMaterial;
        this.estadoMaterial = estadoMaterial;
        this.urlMaterial = urlMaterial;
        this.fechaSubidaMaterial = fechaSubidaMaterial;
    }

    public Long getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(Long idMaterial) {
        this.idMaterial = idMaterial;
    }

    public AsignacionClientDTO getAsignacionCuAsIdMaterial() {
        return asignacionCuAsIdMaterial;
    }

    public void setAsignacionCuAsIdMaterial(AsignacionClientDTO asignacionCuAsIdMaterial) {
        this.asignacionCuAsIdMaterial = asignacionCuAsIdMaterial;
    }

    public String getTituloMaterial() {
        return tituloMaterial;
    }

    public void setTituloMaterial(String tituloMaterial) {
        this.tituloMaterial = tituloMaterial;
    }

    public String getDescripcionMaterial() {
        return descripcionMaterial;
    }

    public void setDescripcionMaterial(String descripcionMaterial) {
        this.descripcionMaterial = descripcionMaterial;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public Boolean getEstadoMaterial() {
        return estadoMaterial;
    }

    public void setEstadoMaterial(Boolean estadoMaterial) {
        this.estadoMaterial = estadoMaterial;
    }

    public String getUrlMaterial() {
        return urlMaterial;
    }

    public void setUrlMaterial(String urlMaterial) {
        this.urlMaterial = urlMaterial;
    }

    public LocalDate getFechaSubidaMaterial() {
        return fechaSubidaMaterial;
    }

    public void setFechaSubidaMaterial(LocalDate fechaSubidaMaterial) {
        this.fechaSubidaMaterial = fechaSubidaMaterial;
    }
}
