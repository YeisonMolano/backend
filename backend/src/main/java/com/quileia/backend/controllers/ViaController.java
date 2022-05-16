package com.quileia.backend.controllers;

import com.quileia.backend.models.Agente;
import com.quileia.backend.models.Via;
import com.quileia.backend.services.ViaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"})
@RestController
@RequestMapping("/via")
public class ViaController {

    @Autowired
    private ViaService viaService;

    @GetMapping("/vias")
    public ResponseEntity<Iterable<Via>> obtenerVias() {
        return ResponseEntity.status(HttpStatus.OK).body(this.viaService.findAll());
    }

    @PostMapping()
    public ResponseEntity<Via> save(@RequestBody Via via) {
        return ResponseEntity.status(HttpStatus.CREATED).body(viaService.save(via));
    }

    @PutMapping()
    public ResponseEntity<Via> update(@RequestBody Via via) {
        return ResponseEntity.status(HttpStatus.CREATED).body(viaService.update(via));
    }

    @PostMapping(value = "/{id}")
    public ResponseEntity<Via> delete(@PathVariable(value = "id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.viaService.delete(id));
    }
}
