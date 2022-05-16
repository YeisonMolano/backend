package com.quileia.backend.controllers;

import com.quileia.backend.models.Agente;
import com.quileia.backend.services.AgenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"})
@RestController
@RequestMapping("/agente")
public class AgenteController {

    @Autowired
    private AgenteService agenteService;

    @GetMapping("/agentes")
    public ResponseEntity<Iterable<Agente>> obtenerAgentes() {
        return ResponseEntity.status(HttpStatus.OK).body(this.agenteService.findAll());
    }
 
    @PostMapping()
    public ResponseEntity<Agente> save(@RequestBody Agente agente) {
        return ResponseEntity.status(HttpStatus.CREATED).body(agenteService.save(agente));
    }

    @PutMapping()
    public ResponseEntity<Agente> update(@RequestBody Agente agente) {
        return ResponseEntity.status(HttpStatus.CREATED).body(agenteService.update(agente));
    }

    @PostMapping(value = "/{id}")
    public ResponseEntity<Agente> delete(@PathVariable(value = "id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.agenteService.delete(id));
    }
}
