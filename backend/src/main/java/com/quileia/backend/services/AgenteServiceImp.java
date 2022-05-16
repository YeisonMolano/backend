package com.quileia.backend.services;

import com.quileia.backend.models.Agente;
import com.quileia.backend.repositories.AgenteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class AgenteServiceImp implements AgenteService {

    @Autowired
    private AgenteRepository agenteviaRepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Agente> findAll() {
        return this.agenteviaRepository.findAll();
    }

    @Override
    public Optional<Agente> findById(Long id) {
        return this.agenteviaRepository.findById(id);
    }

    @Override
    public Agente save(Agente agente) {
        return this.agenteviaRepository.save(agente);
    }

    @Override
    public Agente update(Agente agente) {
        Optional<Agente> optionalAgente = findById(agente.getIdAgente());
        if (optionalAgente.isPresent()) {
            optionalAgente.get().setNombreAgente(agente.getNombreAgente());
            optionalAgente.get().setCodigo(agente.getCodigo());
            optionalAgente.get().setCodigoSecretaria(agente.getCodigoSecretaria());
            optionalAgente.get().setFechaInicio(agente.getFechaInicio());
            return this.agenteviaRepository.save(optionalAgente.get());
        } else {
            return null;
        }
    }

    @Override
    public Agente delete(Long id) {
        System.out.println();
        Agente agente = findById(id).get();
        this.agenteviaRepository.delete(agente);
        return agente;
    }
}
