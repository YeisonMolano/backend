package com.quileia.backend.repositories;

import com.quileia.backend.models.Asignacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AsignacionRepository extends JpaRepository<Asignacion, Long> {
    Iterable<Asignacion> findByAgenteIdAgente(long idAgente);

    Iterable<Asignacion> findByViaIdentificador(long identificador);
}