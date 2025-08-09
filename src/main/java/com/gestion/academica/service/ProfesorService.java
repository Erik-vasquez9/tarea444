package com.gestion.academica.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.gestion.academica.entity.Profesor;
import com.gestion.academica.repository.ProfesorRepository;
import java.util.List;
import java.util.Optional;

@Service
public class ProfesorService {
    @Autowired
    private ProfesorRepository profesorRepo;

    public Profesor crear(Profesor p) { return profesorRepo.save(p); }
    public List<Profesor> listar() { return profesorRepo.findAll(); }
    public Optional<Profesor> obtener(Long id) { return profesorRepo.findById(id); }
    public Profesor actualizar(Long id, Profesor nuevo) {
        nuevo.setId(id);
        return profesorRepo.save(nuevo);
    }
    public void eliminar(Long id) { profesorRepo.deleteById(id); }
}
