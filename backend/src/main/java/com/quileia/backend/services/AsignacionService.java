package com.quileia.backend.services;

import com.quileia.backend.models.Asignacion;

import java.util.Optional;

public interface AsignacionService {
    Iterable<Asignacion> findAll();

    Optional<Asignacion> findById(Long id);

    Asignacion save(Asignacion asignacion);

    Asignacion update(Asignacion agente);

    Iterable<Asignacion> findByAgenteIdAgente(long idAgente);

    Iterable<Asignacion> findByViaIdentificador(long identificador);
}
