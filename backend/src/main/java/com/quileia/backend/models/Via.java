package com.quileia.backend.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "VIAS")
public class Via implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, length = 7)
    private Long identificador;
    @Column(nullable = false, length = 50)
    private String tipo;
    @Column(nullable = false, length = 50)
    private String tipoVia;
    @Column(nullable = false, length = 50)
    private Integer numero;
    @Column(nullable = false, length = 8)
    private Double nivel;

    public Long getIdentificador() {
        return identificador;
    }

    public String getTipo() {
        return tipo;
    }

    public String getTipoVia() {
        return tipoVia;
    }

    public Integer getNumero() {
        return numero;
    }

    public Double getNivel() {
        return nivel;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setTipoVia(String tipoVia) {
        this.tipoVia = tipoVia;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public void setNivel(Double nivel) {
        this.nivel = nivel;
    }
}
