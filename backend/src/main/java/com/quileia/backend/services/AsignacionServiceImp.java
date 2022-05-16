package com.quileia.backend.services;

import com.quileia.backend.models.Asignacion;
import com.quileia.backend.repositories.AsignacionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;
@Service
public class AsignacionServiceImp implements AsignacionService{
    @Autowired
    private AsignacionRepository asignacionRepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Asignacion> findAll() {
        return this.asignacionRepository.findAll();
    }

    @Override
    public Optional<Asignacion> findById(Long id) {
        return this.asignacionRepository.findById(id);
    }

    @Override
    public Asignacion save(Asignacion via) {
        return this.asignacionRepository.save(via);
    }

    @Override
    public Asignacion update(Asignacion idAsignacion) {
        Optional<Asignacion> optionalAsignacion = findById(idAsignacion.getIdAsignacion());
        if (optionalAsignacion.isPresent()) {
            optionalAsignacion.get().setAgente(idAsignacion.getAgente());
            optionalAsignacion.get().setVia(idAsignacion.getVia());
            return this.asignacionRepository.save(optionalAsignacion.get());
        } else {
            return null;
        }
    }

    @Override
    public Iterable<Asignacion> findByAgenteIdAgente(long idAgente) {
        return this.asignacionRepository.findByAgenteIdAgente(idAgente);
    }

    @Override
    public Iterable<Asignacion> findByViaIdentificador(long identificador) {
        return this.asignacionRepository.findByViaIdentificador(identificador);
    }
}
