package com.quileia.backend.controllers;
import com.quileia.backend.models.Asignacion;
import com.quileia.backend.services.AsignacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = {"http://localhost:4200", "http://localhost"})
@RestController
@RequestMapping("/asignacion")
public class AsignacionController {
    @Autowired
    private AsignacionService asignacionService;

    @GetMapping("/asignaciones")
    public ResponseEntity<Iterable<Asignacion>> obtenerAsignacion() {
        return ResponseEntity.status(HttpStatus.OK).body(this.asignacionService.findAll());
    }

    @PostMapping()
    public ResponseEntity<Asignacion> save(@RequestBody Asignacion asignacion) {
        return ResponseEntity.status(HttpStatus.CREATED).body(asignacionService.save(asignacion));
    }

    @PutMapping()
    public ResponseEntity<Asignacion> update(@RequestBody Asignacion asignacion) {
        return ResponseEntity.status(HttpStatus.CREATED).body(asignacionService.update(asignacion));
    }

    @GetMapping("/agentes/{id}")
    public ResponseEntity<Iterable<Asignacion>> obtenerAsignacionProAgente(@PathVariable(value = "id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.asignacionService.findByAgenteIdAgente(id));
    }

    @GetMapping("/vias/{id}")
    public ResponseEntity<Iterable<Asignacion>> obtenerAsignacionPorVias(@PathVariable(value = "id") Long id) {
        return ResponseEntity.status(HttpStatus.OK).body(this.asignacionService.findByViaIdentificador(id));
    }
}
