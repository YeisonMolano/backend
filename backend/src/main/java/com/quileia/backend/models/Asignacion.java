package com.quileia.backend.models;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "ASIGNACION")
public class Asignacion implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false, length = 8)
    private Long idAsignacion;
    @ManyToOne
    @JoinColumn(name = "identificador", nullable = false)
    private Via via;
    @ManyToOne
    @JoinColumn(name = "idAgente", nullable = false)
    private Agente agente;

    public Long getIdAsignacion() {
        return idAsignacion;
    }

    public Via getVia() {
        return via;
    }

    public void setVia(Via via) {
        this.via = via;
    }

    public Agente getAgente() {
        return agente;
    }

    public void setAgente(Agente agente) {
        this.agente = agente;
    }
}
