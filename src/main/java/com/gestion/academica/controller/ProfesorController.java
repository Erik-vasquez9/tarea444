package com.gestion.academica.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.gestion.academica.entity.Profesor;
import com.gestion.academica.service.ProfesorService;
import java.util.List;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {
    @Autowired
    private ProfesorService service;

    @PostMapping
    public Profesor crear(@RequestBody Profesor p) { return service.crear(p); }
    @GetMapping
    public List<Profesor> listar() { return service.listar(); }
    @GetMapping("/{id}")
    public ResponseEntity<Profesor> obtener(@PathVariable Long id) {
        return service.obtener(id).map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }
    @PutMapping("/{id}")
    public Profesor actualizar(@PathVariable Long id, @RequestBody Profesor nuevo) {
        return service.actualizar(id, nuevo);
    }
    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) { service.eliminar(id); }
}
