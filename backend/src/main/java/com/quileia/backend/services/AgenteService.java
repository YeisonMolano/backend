package com.quileia.backend.services;


import com.quileia.backend.models.Agente;

import java.util.Optional;

public interface AgenteService {

    Iterable<Agente> findAll();

    Optional<Agente> findById(Long id);

    Agente save(Agente agente);

    Agente update(Agente agente);

    Agente delete(Long id);
}