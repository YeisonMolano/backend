package com.quileia.backend.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "AGENTES")
public class Agente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(nullable = false, length = 8)
    private Long idAgente;
    @Column(nullable = false, length = 50)
    private String nombreAgente;
    @Column(nullable = false, length = 50)
    private String codigo;
    @Column(nullable = false, length = 50)
    private String codigoSecretaria;
    @Column(nullable = false, length = 8)
    private Double fechaInicio;

    public Long getIdAgente() {
        return idAgente;
    }

    public String getNombreAgente() {
        return nombreAgente;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getCodigoSecretaria() {
        return codigoSecretaria;
    }

    public Double getFechaInicio() {
        return fechaInicio;
    }

    public void setNombreAgente(String nombreAgente) {
        this.nombreAgente = nombreAgente;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setCodigoSecretaria(String codigoSecretaria) {
        this.codigoSecretaria = codigoSecretaria;
    }

    public void setFechaInicio(Double fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
