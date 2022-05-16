package com.quileia.backend.services;

import com.quileia.backend.models.Via;
import com.quileia.backend.repositories.ViaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
public class ViaServiceImp implements ViaService {

    @Autowired
    private ViaRepository ssviaRepository;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Via> findAll() {
        return this.ssviaRepository.findAll();
    }

    @Override
    public Optional<Via> findById(Long id) {
        return this.ssviaRepository.findById(id);
    }

    @Override
    public Via save(Via via) {
        return this.ssviaRepository.save(via);
    }

    @Override
    public Via update(Via via) {
        Optional<Via> optionalVia = findById(via.getIdentificador());
        if (optionalVia.isPresent()) {
            optionalVia.get().setTipo(via.getTipo());
            optionalVia.get().setTipoVia(via.getTipoVia());
            optionalVia.get().setNumero(via.getNumero());
            optionalVia.get().setNivel(via.getNivel());
            return this.ssviaRepository.save(optionalVia.get());
        } else {
            return null;
        }
    }

    @Override
    public Via delete(Long id) {
        Via via = findById(id).get();
        this.ssviaRepository.delete(via);
        return via;
    }
}
