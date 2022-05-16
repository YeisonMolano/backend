package com.quileia.backend.services;


import com.quileia.backend.models.Via;

import java.util.Optional;

public interface ViaService {

    Iterable<Via> findAll();

    Optional<Via> findById(Long id);

    Via save(Via via);

    Via update(Via via);

    Via delete(Long id);
}